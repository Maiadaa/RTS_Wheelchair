/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

/**
 *
 * @author PC
 */
public class DetectObstacle {
    private boolean Obstacle;

    public DetectObstacle(boolean Obstacle) {
        this.Obstacle = Obstacle;
    }

    public boolean isObstacle() {
        return Obstacle;
    }    
}