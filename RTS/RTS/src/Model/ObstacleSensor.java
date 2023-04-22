/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mahmo
 */
public class ObstacleSensor {
    private boolean Obstacle;

    public ObstacleSensor(boolean Obstacle) {
        this.Obstacle = Obstacle;
    }

    
    public void setObstacle(boolean Obstacle) {
        this.Obstacle = Obstacle;
    }

    public boolean isObstacle() {
        return Obstacle;
    }
    
    
    public boolean DetectObstacle()
    {
        return true;
    }
    
    public double DetectSpeed()
    {
        return 0;
    }
    
    
}
