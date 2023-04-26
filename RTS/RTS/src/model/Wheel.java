/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahmo
 */
public class Wheel extends Thread{
    boolean stopCommand;
    WheelChair chair;
    
    
    public Wheel() {
    }

    public Wheel(WheelChair chair) {
        this.chair = chair;
    }

    public boolean isStopCommand() {
        return stopCommand;
    }

    public void setStopCommand(boolean stopCommand) {
        this.stopCommand = stopCommand;
    }
    
//    public void decelerate(){
//        stopCommand = true;
//         if (speed != 0) {
//            speed -= random(1, 5); 
//        } else {
//            System.out.println("The chair is already stopped, speed is 0.");
//        }
//    }
    
    public void accelerate(){
         if(chair.getBattery().getPercentage() != 0.0 && chair.isEngineOn()){
             double x = chair.getSpeedSensor().DetectSpeed();
            if ( x < 20) {
                x += 1; 
                System.out.println("The current speed is : " + x);
                chair.getSpeedSensor().setSpeed(x);
            } else {
                System.out.println("The chair is already at max speed.");
            }
         }
    }
        
    @Override
    public void run()
    {
        while (true) {
            try {
                this.sleep(1000);
                accelerate();
//                if(speed>0){
//                    System.out.println("Your speed now is : " + speed);
//                }else
//                    System.out.println("Your speed now is 0");
            } catch (InterruptedException ex) {
                Logger.getLogger(NavigationSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
