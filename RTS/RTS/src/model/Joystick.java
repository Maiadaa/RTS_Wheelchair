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

    public Joystick() {
    }
    

    public Joystick(String Direction) {
        this.Direction = Direction;
    }
     
    public String getDirection() {
        return Direction;
    }
    
    public void ControlMovement (String direction){
        
    }
    
    public double DetectSpeed(){
        
        return 0;
        
    }
}
