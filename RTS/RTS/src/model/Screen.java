/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mahmo
 */
public class Screen {
    private WheelChair chair;
    public Screen(WheelChair chair) {
        this.chair = chair;
    }

    public Screen() {
        
    }
    

    public void DisplayBattery(double battery)
    {
        this.chair.getGui().getBatteryScreen().setText(Double.toString(battery));

    }
    
    public void DisplaySpeed(double Speed)
    {
        this.chair.getGui().getSpeedScreen().setText(Double.toString(Speed));
    }
    
    public void DisplayObstacle(String Obstacle)
    {
        this.chair.getGui().getObstacleScreen().setText(Obstacle);
    }
    
    public void DisplayBatteryStatus(String charge)
    {
        this.chair.getGui().getChargingScreen().setText(charge);
    }
    
    public void DisplayDirection(String Direction)
    {
        this.chair.getGui().getDirectionScreen().setText(Direction);
    }
}
