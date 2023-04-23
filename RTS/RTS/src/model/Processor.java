/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author mahmo
 */
public class Processor {
    private double Speed;
    
    private WheelChair chair;
    private Wheel wheel;
    public Processor() {
    }

    public Processor(double Speed, WheelChair chair) {
        this.chair=chair;
        this.Speed = 0.0;
        //the chair is initially idle, speed is 0.0
    }
    
    public double getSpeed() {
        return Speed;
    }
    
    public void ControlSpeed(double speed){
        this.Speed = speed;
        System.out.println("The speed is: " + speed);
    }
}
