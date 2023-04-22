/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mahmo
 */
public class Wheel {
    boolean stopCommand;
    
    public Wheel() {
    }

    public Wheel(Boolean stopCommand) {
        this.stopCommand = stopCommand;
    }

    public boolean isStopCommand() {
        return stopCommand;
    }

    public void setStopCommand(boolean stopCommand) {
        this.stopCommand = stopCommand;
    }
    
    public void decelerate(){
        stopCommand = true;
    }
    
    public void accelerate(){
        stopCommand = false;
    }
    
    
}
