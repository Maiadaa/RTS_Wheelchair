/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import rts.Config;
import events.DetectCarSpeed;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahmo
 */
public class SpeedSensor extends Thread{
    private double Speed = 0;
    private WheelChair chair;

    public void setSpeed(double Speed) {
        this.Speed = Speed;
    }

    public double randomSpeed(double min, double max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }
    
    public double getSpeed() {
        return Speed;
    }
    
    public String DisplaySpeed(double Speed){
        
        return null;
        
    }

    public double DetectSpeed(){
        double speed;
        Config.sendEvent(new DetectCarSpeed(Speed));
        return Speed;
    }
    
    @Override
    public void run(){
        while (true) { 
            try {
                this.sleep(5000);
                DetectSpeed();
            } catch (InterruptedException ex) {
                Logger.getLogger(SpeedSensor.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }

    }
}
