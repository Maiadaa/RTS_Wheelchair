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
public class Brake {
    boolean stopCommand;
    double speed;

    public Brake() {
    }

    public Brake(boolean stopCommand) {
        this.stopCommand = stopCommand;
    }

    public boolean isStopCommand() {
        return stopCommand;
    }

    public void setStopCommand(boolean stopCommand) {
        this.stopCommand = stopCommand;
    }
    
    public void decelerate (){
        if (speed != 0) {
            speed -= random(1, 5); 
        } else {
            System.out.println("The chair is already stopped, speed is 0.");;
        }
    }
    
    public double detectSpeed(){
        return 0.0;
    }
    
    private int random(int min, int max) {
        
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        
        Random r = new Random();
        return r.nextInt((max - min) + 3) + min;
    }
    
}
