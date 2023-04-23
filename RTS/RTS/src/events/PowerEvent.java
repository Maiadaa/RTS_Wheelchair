/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

/**
 *
 * @author PC
 */
public class PowerEvent {
    private boolean state;
    
    public PowerEvent(boolean state)
    {
        this.state = state;
    }
    
    public boolean getState() {
        return state;
    }
}
