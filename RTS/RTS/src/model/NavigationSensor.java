/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import events.MeasureDistance;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import rts.Config;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;

/**
 *
 * @author mahmo
 */
public class NavigationSensor extends Thread {
    private double distanceToObstacle = 5.0;
    private WheelChair chair;

    String[] arr = {"right", "left"};
    Random r1 = new Random();

    // randomly selects an index from the arr
    int select = r1.nextInt(arr.length);

    private int random(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public NavigationSensor(WheelChair chair) {
        this.chair = chair;
    }

    public double getDistanceToObstacle() {
        return distanceToObstacle;
    }
//
//    public double detectLocation(int min, int max) {
//        if (min > max) {
//            throw new IllegalArgumentException("max must be greater than min");
//        } else {
//            Random r = new Random();
//            return min + (max - min) * r.nextDouble();
//        }
//    }
    
    public void measureDistance() {
        distanceToObstacle = random(1, 5);
        this.chair.getObsSensor().DetectObstacle(distanceToObstacle);
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (this.chair.getSpeedSensor().DetectSpeed() != 0) {
                    this.sleep(3000);
                    measureDistance();
                    Config.sendEvent(new MeasureDistance(distanceToObstacle));
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(NavigationSensor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
