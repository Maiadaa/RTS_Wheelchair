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

    public Screen() {
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

    public String DisplayBattery()
    {
        return "null";
    }
    
    public String DisplaySpeed()
    {
        return "null";
    }
    
    public String DisplayDistance()
    {
        return "null";
    }
    
    public String DisplayObstacle()
    {
        return "null";
    }
    
    public String DisplayBatteryStatus()
    {
        return "null";
    }
    
}
