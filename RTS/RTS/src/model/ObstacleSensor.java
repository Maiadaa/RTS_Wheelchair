/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mahmo
 */
public class ObstacleSensor {
    private boolean Obstacle;
    private WheelChair wheel;

    public ObstacleSensor(boolean Obstacle, WheelChair wheel) {
        this.Obstacle = false;
        this.wheel = wheel;
    }

    public ObstacleSensor() {
    }
    
    public void setObstacle(boolean Obstacle) {
        this.Obstacle = Obstacle;
    }

    public boolean isObstacle() {
        return Obstacle;
    }
    
    public boolean DetectObstacle()
    {
       if (Obstacle){
            if (this.wheel.getNavSensor().getDistanceToObstacle() < 2){
                this.wheel.getBrake().decelerate();
                this.wheel.getJoystick().ControlMovement("left");
                if (Obstacle){
                    this.wheel.getBrake().decelerate();
                    this.wheel.getJoystick().ControlMovement("right");
                }
                DetectObstacle();
//              wheel.getGui().getObstacle().setText("ObstacleDetected");
            }
            return true;
        }
       else
           return false;
    }
    
//    public double DetectSpeed()
//    {
//        return 0;
//    }
    
    
}
