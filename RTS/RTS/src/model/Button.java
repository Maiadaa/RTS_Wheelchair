/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mahmo
 */
public class Button {
    private boolean StartCommand;

    public Button() {
    }

    public Button(boolean StartCommand) {
        this.StartCommand = StartCommand;
    }

    public boolean isStartCommand() {
        return StartCommand;
    }

    public void setStartCommand(boolean StartCommand) {
        this.StartCommand = StartCommand;
    }
    
    public void StartMovement(boolean command)
    {
        
    }
}
