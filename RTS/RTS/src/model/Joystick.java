/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.ControlMovement;
import events.MeasureDistance;
import java.util.logging.Level;
import java.util.logging.Logger;
import rts.Config;

/**
 *
 * @author mahmo
 */
public class Joystick
//        extends Thread 
{

    private String Direction;

    private WheelChair chair;

    public Joystick(WheelChair chair) {
        this.chair = chair;
        this.Direction = "Forward";
        System.out.println("Engine Off");
    }
  

    public void ControlMovement(String direction) {
        // change direction 
        this.Direction = direction;
        System.out.println("Changing direction to move " + direction);
        chair.getScreen().DisplayDirection(direction);
    }

    public String getDirection() {
        return Direction;
    }

}
