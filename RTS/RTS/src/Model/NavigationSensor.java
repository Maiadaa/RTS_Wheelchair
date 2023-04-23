/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mahmo
 */
public class NavigationSensor {
    
    private String currentCoordinates;
    private String Destination;
    private double distanceToObstacle;

    public NavigationSensor() {
    }

    public String getCurrentCoordinates() {
        return currentCoordinates;
    }

    public String getDestination() {
        return Destination;
    }

    public double getDistanceToObstacle() {
        return distanceToObstacle;
    }
    
    public String detectLocation(){
        
        return null;
        
    }
    
    public double measureDistance() {
        return 0;
    }
    
}
