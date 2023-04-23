/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mahmo
 */
public class Battery {
    private double Percentage;
    private String Status;

    public Battery() {
    }
    
    
    
    public Battery(double Percentage, String Status) {
        this.Percentage = Percentage;
        this.Status = Status;
    }
    public double getPercentage() {
        return Percentage;
    }

    public String getStatus() {
        return Status;
    }
    public double MeasurePercentage(){
        
        return 0;
        
    }
    
    public String SetStatus(){
        
        return null;
        
    }
}
