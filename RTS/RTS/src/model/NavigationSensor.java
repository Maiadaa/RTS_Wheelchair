/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.MeasureDistance;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import rts.Config;

/**
 *
 * @author mahmo
 */
public class NavigationSensor extends Thread {
    
    private String currentCoordinates;
    private String Destination;
    private double distanceToObstacle;
    private ObstacleSensor obSensor;
    private WheelChair chair;

    private int random(int min, int max) {
        
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    public NavigationSensor() {
    }

    public String getCurrentCoordinates() {
        return currentCoordinates;
    }

    public String getDestination() {
        return Destination;
    }

    public double getDistanceToObstacle() {
        return distanceToObstacle;
    }
    
    public double detectLocation(int min, int max){
        if(min>max)
        {
            throw new IllegalArgumentException("max must be greater than min");
        }
        else
        {
            Random r = new Random();
            return min + (max - min) * r.nextDouble();
        } 
    }
    
    public void measureDistance() {
//        double obLoc = obSensor.DetectObstacleLocation(20,60);
//        double myLoc = detectLocation(15,60);
//        if(obLoc > myLoc)
//        {
//            Config.sendEvent(new MeasureDistance(obLoc-myLoc));
//        }
//        return 0;
        distanceToObstacle = random(1, 10);
        chair.getObsSensor().DetectObstacle();    
    }

    @Override
    public void run()
    {
        while (true) {
            try {
                this.sleep(4000);
                measureDistance();
                System.out.println("Distance to obstacle = " + distanceToObstacle);
            } catch (InterruptedException ex) {
                Logger.getLogger(NavigationSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
