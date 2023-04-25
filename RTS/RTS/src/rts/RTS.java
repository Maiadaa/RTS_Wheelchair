/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rts;

import events.DetectLocationCoordinates;
import events.PowerEvent;
import model.SpeedSensor;
import model.Battery;
import model.Brake;
import model.NavigationSensor;
import model.WheelChair;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author mahmo
 */
public class RTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Disable logging
        Logger.getRootLogger().setLevel(Level.OFF);

        // Register events
        Config.registerEvents();

        // Create Wheelchair
        final WheelChair chair = new WheelChair();

//        Config.createStatement("select temp from TempSensorReading")
//                .setSubscriber(new Object() {
//                    public void update(int temp) {
//                        chair.tempSignal(temp);
//                    }
//                });

        Config.createStatement("select state from PowerEvent")
                .setSubscriber(new Object() {
                    public void update(boolean state) {
                        chair.setState(state);
                    }
                });
        
        Config.createStatement("select speed from Decelerate")
                .setSubscriber(new Object() {
                    public void update(double speed) {
                        chair.getBrake().decelerate();
                    }
                });
        
        Config.createStatement("select speed from Accelerate")
                .setSubscriber(new Object() {
                    public void update(double speed) {
                        chair.getWheel().accelerate();
                    }
                });
        
        
                Config.createStatement("select direction from ControlMovement")
                .setSubscriber(new Object() {
                    public void update(String direction) {
                        chair.getJoystick().ControlMovement(direction);
                    }
                });
        
        
        Config.createStatement("select speed from DetectCarSpeed").setSubscriber(new Object(){
        public void update(double speed){
          chair.getGui().getSpeedScreen().setText(Double.toString(speed));
        }
        });
        
        Config.createStatement("select distance from MeasureDistance").setSubscriber(new Object(){
        public void update(double distance){
            System.out.println("The distance is: " + distance);
        }
        });
        
        Config.createStatement("select percentage from MeasureBatteryPercentage").setSubscriber(new Object(){
        public void update(double percentage){
            chair.getGui().getBatteryScreen().setText(Double.toString(percentage));
            if(percentage <= 0)
            {
               chair.getGui().getBatteryScreen().setText("CHARGE YAD"); 
            }
            
        }
        });
        
        
        SpeedSensor s1 = new SpeedSensor();
        NavigationSensor n1 = new NavigationSensor(chair);
        Battery b1 = new Battery();
        b1.start();
        s1.start();
        n1.start();
                

    }

}
