/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.PowerEvent;
import rts.Config;

/**
 *
 * @author mahmo
 */
public class Button {

//    private boolean StartCommand;
    private boolean state;
    private WheelChair chair;

    public Button(WheelChair chair) {
        this.state = false;
        this.chair = chair;
    }

    public void setState(boolean state) {
        this.state = state;
        if (state) {
            chair.getGui().getOffBtn().setEnabled(true);
            chair.getGui().getOnBtn().setEnabled(false);

            chair.getGui().getAccelerateBtn().setEnabled(true);
            chair.getGui().getBrakeBtn().setEnabled(true);
            chair.getGui().getForwardBtn().setEnabled(true);
            chair.getGui().getBackwardBtn().setEnabled(true);
            chair.getGui().getLeftBtn().setEnabled(true);
            chair.getGui().getRightBtn().setEnabled(true);

        } else {
            chair.getGui().getOnBtn().setEnabled(true);
            chair.getGui().getOffBtn().setEnabled(false);

            chair.getGui().getAccelerateBtn().setEnabled(false);
            chair.getGui().getBrakeBtn().setEnabled(false);
            chair.getGui().getForwardBtn().setEnabled(false);
            chair.getGui().getBackwardBtn().setEnabled(false);
            chair.getGui().getLeftBtn().setEnabled(false);
            chair.getGui().getRightBtn().setEnabled(false);

            chair.getGui().getDirectionScreen().setText("IDLE");
            chair.getJoystick().ControlMovement("IDLE");

            chair.getGui().getObstacleScreen().setText("No Obstacle");
            chair.getObsSensor().setObstacle(false);

            chair.getGui().getSpeedScreen().setText("0.0");
            chair.getSpeedSensor().setSpeed(0.0);

        }
    }

    public void brake(boolean br) {
        if (br) {
            chair.getBrake();
            chair.getGui().getBrakeBtn().setEnabled(false);
        }
    }
//    public Button() {
//    }
//
//    public Button(boolean StartCommand) {
//        this.StartCommand = StartCommand;
//    }
//
//    public boolean isStartCommand() {
//        return StartCommand;
//    }
//
//    public void setStartCommand(boolean StartCommand) {
//        this.StartCommand = StartCommand;
//    }
//
//    public void StartMovement(boolean command) {
//
//    }
}
