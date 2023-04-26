/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.MeasureBatteryPercentage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import rts.Config;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;

/**
 *
 * @author mahmo
 */
public class Battery extends Thread{
    private double Percentage = 100;
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

    public void MeasurePercentage(){
       if(this.Percentage == 0){
           return;
       }
        
        this.setPercentage(--Percentage);
    }

    public void setPercentage(double Percentage) {
        this.Percentage = Percentage;
    }

    @Override
    public void run(){
        
        while (true) {
            if (chair.isEngineOn()){
                try {
                Thread.sleep(1000);
                MeasurePercentage();
                System.out.println(Percentage);
                Config.sendEvent(new MeasureBatteryPercentage(Percentage));
                
                if(Percentage <= 0)
                {
                    chair.setState(false);
                    InputStream input;
//                    try {
//                        input = new FileInputStream(new File("src/Sounds/ebrahim.wav"));
//                        AudioStream audio = new AudioStream(input);
//                        AudioPlayer.player.start(audio);
//
//                    } catch (IOException ex) {
//                        Logger.getLogger(Battery.class.getName()).log(Level.SEVERE, null, ex);
//                    }
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
