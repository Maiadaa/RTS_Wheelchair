/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.ControlMovement;
import events.MeasureDistance;
import java.util.logging.Level;
import java.util.logging.Logger;
import rts.Config;

/**
 *
 * @author mahmo
 */
public class Joystick
//        extends Thread 
{

    private String Direction;

    private WheelChair chair;

    public Joystick(WheelChair chair) {
        this.chair = chair;
        this.Direction = "Forward";
        System.out.println("Engine Off");
    }
//
//    public Joystick(String Direction) {
//        this.Direction = Direction;
//    }
//     

    public void ControlMovement(String direction) {
        // change direction 
        this.Direction = direction;
        System.out.println("Changing direction to move " + direction);
        this.chair.getGui().getDirectionScreen().setText(direction);
    }

//    public double DetectSpeed() {
//        this.chair.getSpeedSensor().
//        return 0;
//
//    }

    public String getDirection() {
        return Direction;
    }
    
//    @Override
//    public void run()
//    {
//        while (true) {
//            try {
//                while(this.chair.getSpeedSensor().DetectSpeed() != 0){
//                    this.sleep(3000);
////                    ControlMovement(Direction);
////                    Config.sendEvent(new ControlMovement(Direction));
//                }
//            } catch (InterruptedException ex) {
//                Logger.getLogger(NavigationSensor.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }
//    }

}
