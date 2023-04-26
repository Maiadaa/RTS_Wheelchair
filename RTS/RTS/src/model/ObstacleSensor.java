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
public class ObstacleSensor {
    private boolean Obstacle;
    private WheelChair chair;

    
    
    public ObstacleSensor(WheelChair wheel) {
        this.Obstacle = true;
        this.chair = wheel;
    }
    

    public ObstacleSensor() {
    }
    
    public void setObstacle(boolean Obstacle) {
        this.Obstacle = Obstacle;
    }

    public boolean isObstacle() {
        return Obstacle;
    }
    
    public void DetectObstacle(double distance) {
        if (Obstacle) {
            if (distance < 3.0) {
                chair.getScreen().DisplayObstacle("!! Obstacle Detected !!");
                this.chair.getBrake().decelerate();
                chair.getScreen().DisplayDirection("Right");
            } else {
                chair.getScreen().DisplayObstacle("No Obstacle");
                chair.getScreen().DisplayDirection("Forward");
            }
        }
    }
    
    
//    public double DetectSpeed()
//    {
//        return 0;
//    }
    
    
}
