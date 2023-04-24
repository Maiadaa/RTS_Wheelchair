/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rts;

import model.SpeedSensor;
import model.Battery;
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

        // Create Kettle
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
                chair.isEngineOn();
            }
        });

    }

}

}
