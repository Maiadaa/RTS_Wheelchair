/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author mahmo
 */
public class Wheel {
    boolean stopCommand;
    double speed;
    WheelChair chair;
    
    
    public Wheel() {
    }

    public Wheel(Boolean stopCommand) {
        this.stopCommand = stopCommand;
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
         double x = chair.getSpeedSensor().getSpeed();
        while (x != 30 ){
            if ( x < 30) {
                x += 1; 
                System.out.println("The current speed is : " + x);
            } else {
                System.out.println("The chair is already at max speed.");;
            }
        }
    }
    
    private int random(int min, int max) {
        
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        
        Random r = new Random();
        return r.nextInt((max - min) + 3) + min;
    }
    
    
    
}
