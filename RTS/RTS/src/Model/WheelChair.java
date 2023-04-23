/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import view.WheelChairScreen;

/**
 *
 * @author PC
 */
public class WheelChair {

    private WheelChairScreen gui;
    
    private Battery battery;
    private Brake brake;
    private Button button;
    private Joystick joystick;
    private NavigationSensor navSensor;
    private ObstacleSensor obsSensor;
    private Processor processor;
    private Screen screen;
    private SpeedSensor speedSensor;
    private Wheel wheel;

    public WheelChair() {
        
        this.gui = new WheelChairScreen();
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        
        this.battery = new Battery();
        this.brake = new Brake();
        this.button = new Button();
        this.joystick = new Joystick();
        this.navSensor = new NavigationSensor();
        this.obsSensor = new ObstacleSensor();
        this.processor = new Processor();
        this.screen = new Screen();
        this.speedSensor = new SpeedSensor();
        this.wheel = new Wheel();
    }
    

    public WheelChairScreen getGui() {
        return gui;
    }

    public Battery getBattery() {
        return battery;
    }

    public Brake getBrake() {
        return brake;
    }

    public Button getButton() {
        return button;
    }

    public Joystick getJoystick() {
        return joystick;
    }

    public NavigationSensor getNavSensor() {
        return navSensor;
    }

    public ObstacleSensor getObsSensor() {
        return obsSensor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Screen getScreen() {
        return screen;
    }

    public SpeedSensor getSpeedSensor() {
        return speedSensor;
    }

    public Wheel getWheel() {
        return wheel;
    }
    
    
    
}
