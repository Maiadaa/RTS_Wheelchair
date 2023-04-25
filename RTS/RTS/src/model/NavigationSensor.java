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
        private boolean Obstacle = true;
        
         
    private String Destination;
    private double distanceToObstacle;
    private WheelChair chair;

    String [] arr = {"right", "left"};
         Random r1 = new Random();

         // randomly selects an index from the arr
         int select = r1.nextInt(arr.length); 
    private int random(int min, int max) {
        
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public NavigationSensor(WheelChair chair) {
        this.chair = chair;
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
    
    public void DetectObstacle(double distance)
    {
        if (Obstacle){
            if (distance < 3.0){
                this.chair.getGui().getObstacleScreen().setText("Obstacle Detected Yad");
                this.chair.getBrake().decelerate();
                this.chair.getJoystick().ControlMovement("Right");
//              wheel.getGui().getObstacle().setText("ObstacleDetected");
            }
            else
            {
               this.chair.getGui().getObstacleScreen().setText("No Obstacle Yad"); 
               this.chair.getJoystick().ControlMovement("Forward");
            }
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
        distanceToObstacle = random(1, 5);
        DetectObstacle(distanceToObstacle);
    }

    @Override
    public void run()
    {
        while (true) {
            try {
                while(this.chair.getSpeedSensor().DetectSpeed() != 0){
                    this.sleep(3000);
                    measureDistance();
                    Config.sendEvent(new MeasureDistance(distanceToObstacle));
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(NavigationSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
