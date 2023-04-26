/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.MeasureBatteryPercentage;
import events.PowerEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import rts.Config;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author mahmo
 */
public class Button extends Thread {
    private boolean state;
    private WheelChair chair;
    private double currentBatteryPercentage = 100.0;

    public Button(WheelChair chair) {
        this.state = false;
        this.chair = chair;
    }

    public void setState(boolean state) throws InterruptedException {
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
            Battery b1 = new Battery(chair, currentBatteryPercentage);
            b1.setPercentage(this.currentBatteryPercentage);
            b1.start();
            if (currentBatteryPercentage <= 0.0) {
                currentBatteryPercentage = 100;
                b1.setPercentage(this.currentBatteryPercentage);
                b1.start();
            }

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
            this.currentBatteryPercentage = Double.parseDouble(chair.getGui().getBatteryScreen().getText());
  
            if (currentBatteryPercentage == 0.0) {
                chair.getGui().getChargingScreen().setText("CHARGING");
                chair.getGui().getOnBtn().setEnabled(false);
                Thread.sleep(5000);
                chair.getGui().getChargingScreen().setText("");
                chair.getGui().getOnBtn().setEnabled(true);
            }
        }
    }

    public void brake(boolean br) {
        if (br) {
            chair.getBrake();
            chair.getGui().getBrakeBtn().setEnabled(false);
        }
    }

}
