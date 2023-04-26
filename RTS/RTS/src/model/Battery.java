/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.MeasureBatteryPercentage;
import rts.Config;

/**
 *
 * @author mahmo
 */
public class Battery extends Thread{
    private double Percentage = 100;
    private String Status; 
    private WheelChair chair;

    public Battery(WheelChair chair) {
        this.chair = chair;
    }

    public Battery(WheelChair chair, double Percentage) {
        this.chair = chair;
        this.Percentage = Percentage;
    }

    public double getPercentage() {
        return Percentage;
    }

    public String getStatus() {
        return Status;
    }
    public void MeasurePercentage(){
       if(this.Percentage == 0){
//           chair.setState(false);
           return;
       }
        
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
            if (chair.isEngineOn()){
                try {
                Thread.sleep(200);
                MeasurePercentage();
                System.out.println(Percentage);
                Config.sendEvent(new MeasureBatteryPercentage(Percentage));
                
                if(Percentage <= 0)
                {
//                    chair.getGui().getBatteryScreen().setText("Charge yad");
                    chair.setState(false);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }else if (!chair.isEngineOn()){
                break;
            }            
        }
    }
}
