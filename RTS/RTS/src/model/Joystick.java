/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mahmo
 */
public class Joystick {

    private String Direction;

    private WheelChair chair;

    public Joystick(WheelChair chair) {
        this.chair = chair;
        this.Direction = "Forward";
        System.out.println("Default movement is moving forward");
    }
//
//    public Joystick(String Direction) {
//        this.Direction = Direction;
//    }
//     

    public void ControlMovement(String direction) {
        // change direction 
        this.Direction = direction;
        System.out.println("Changing direction to move " + direction);
    }

//    public double DetectSpeed() {
//        this.chair.getSpeedSensor().
//        return 0;
//
//    }

    public String getDirection() {
        return Direction;
    }

}
