/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.Decelerate;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import rts.Config;

/**
 *
 * @author mahmo
 */
public class Brake extends Thread {
    boolean stopCommand;
    double speed;

    public Brake() {
    }

    public Brake(double speed) {
        this.speed = speed;
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
        if (speed > 0) {
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
        return r.nextInt((max - min) + 1) + min;
    }
    
    @Override
    public void run() {
        while (true) {
            
            try {
                this.sleep(3000);
                decelerate();
                if (speed > 0){
                System.out.println("Your speed is now: " + speed);}
                else{
                    System.out.println("Your speed is now: 0"); 
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Brake.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Config.sendEvent(new Decelerate(speed));
        }
    }
    
}
