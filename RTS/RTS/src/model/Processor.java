///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package model;
//
//import java.util.Random;
//
///**
// *
// * @author mahmo
// */
//public class Processor {
//    private double Speed;
//    private boolean cruising;
//    private WheelChair chair;
//
//    public Processor(double speed, boolean cruise, WheelChair chair) {
//        this.chair=chair;
//        this.cruising = cruise;
//        this.Speed = speed;
//    }
//    
//    public double getSpeed() {
//        return Speed;
//    }
//
//    public boolean CruisingButton () {
//        if (cruising){
////          this.chair.getGui().getCruiseText().setText("Cruising ON");
//            return true;
//        }
//        else{
////            this.chair.getGui().getCruiseText().setText("Cruising OFF");
//            return false;
//        }
//    }
//        
//    public void ControlSpeed(double speed){
//        if (this.CruisingButton()){
//            double CSpeed = this.chair.getSpeedSensor().DetectSpeed();
//            this.chair.getSpeedSensor().setSpeed(CSpeed);
//            this.chair.getSpeedSensor().DisplaySpeed(CSpeed);
//            System.out.println("Cruising mode on");
//        }
//    }
//}
