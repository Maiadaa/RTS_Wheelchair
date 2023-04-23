/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rts;

import model.SpeedSensor;
import model.Battery;
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
        /*Logger.getRootLogger().setLevel(Level.OFF);
        Config.registerEvents();
        Config.createStatement("select speed from DetectCarSpeed").setSubscriber(new Object(){
            public void update(double speed){
                System.out.println("Speed: " + speed);
            }
        });*/
        Battery b = new Battery();
        b.run();
    }
    
}
