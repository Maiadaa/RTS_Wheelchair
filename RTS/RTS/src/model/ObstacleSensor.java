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
        this.chair = wheel;
    }
    

    public ObstacleSensor() {
    }
    
    public void setObstacle(boolean Obstacle) {
        this.Obstacle = Obstacle;
    }

    
    public void DetectObstacle(double distance) {
        this.Obstacle = true;
        if (Obstacle) {
            if (distance < 3.0) {
//                 this.chair.getGui().getObstacleScreen().setText("Obstacle Detected");
                this.Obstacle = true;
                chair.getScreen().DisplayObstacle("!! Obstacle Detected !!");
                this.chair.getBrake().decelerate();
                this.chair.getJoystick().ControlMovement("Right");
//                chair.getScreen().DisplayDirection("Right");
            } else {
                this.Obstacle = false;
//                 this.chair.getGui().getObstacleScreen().setText("No Obstacle");
                this.chair.getJoystick().ControlMovement("Forward");
                chair.getScreen().DisplayObstacle("No Obstacle");
//                chair.getScreen().DisplayDirection("Forward");
            }
        }
    }
    
    
//    public double DetectSpeed()
//    {
//        return 0;
//    }
    
    
}
