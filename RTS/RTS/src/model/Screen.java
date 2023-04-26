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
    private String SpeedMessage;
    private String ObstacleMessage;
    private String BatteryMessage;
    private String DistanceMessage;
    private WheelChair chair;
    public Screen(WheelChair chair) {
        this.chair = chair;
    }

    public Screen(String SpeedMessage, String ObstacleMessage, String BatteryMessage, String DistanceMessage) {
        this.SpeedMessage = SpeedMessage;
        this.ObstacleMessage = ObstacleMessage;
        this.BatteryMessage = BatteryMessage;
        this.DistanceMessage = DistanceMessage;
    }
    
    public String getSpeedMessage() {
        return SpeedMessage;
    }

    public String getObstacleMessage() {
        return ObstacleMessage;
    }

    public String getBatteryMessage() {
        return BatteryMessage;
    }

    public String getDistanceMessage() {
        return DistanceMessage;
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
