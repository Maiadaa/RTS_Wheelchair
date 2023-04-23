/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mahmo
 */
public class Battery extends Thread{
    private double Percentage = 100;
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
    public void MeasurePercentage(){
      this.setPercentage(--Percentage);
    }

    public void setPercentage(double Percentage) {
        this.Percentage = Percentage;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    @Override
    public void run(){
        while (true) {
            try {
                Thread.sleep(30000);
                MeasurePercentage();
                System.out.println(Percentage);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
