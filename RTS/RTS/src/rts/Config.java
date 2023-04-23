/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rts;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import events.Accelerate;
import events.ControlMovement;
import events.ControlSpeed;
import events.Decelerate;
import events.DetectCarSpeed;
import events.DetectLocationCoordinates;
import events.DetectObstacle;
import events.MeasureBatteryPercentage;
import events.MeasureDistance;
import events.StartMovement;
import events.StopMovement;

/**
 *
 * @author Youssef Negm
 */
public class Config {

    private static EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider();

    public static void registerEvents() {
        engine.getEPAdministrator().getConfiguration().addEventType(Accelerate.class);
        engine.getEPAdministrator().getConfiguration().addEventType(ControlMovement.class);
        engine.getEPAdministrator().getConfiguration().addEventType(ControlSpeed.class);
        engine.getEPAdministrator().getConfiguration().addEventType(Decelerate.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DetectCarSpeed.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DetectLocationCoordinates.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DetectCarSpeed.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DetectObstacle.class);
        engine.getEPAdministrator().getConfiguration().addEventType(MeasureBatteryPercentage.class);
        engine.getEPAdministrator().getConfiguration().addEventType(MeasureDistance.class);
        engine.getEPAdministrator().getConfiguration().addEventType(StartMovement.class);
        engine.getEPAdministrator().getConfiguration().addEventType(StopMovement.class);

        System.out.println("Events Successfully Registered.");
    }

    public static EPStatement createStatement(String s) {
        EPStatement result = engine.getEPAdministrator().createEPL(s);
        System.out.println("EPL Statement Successfully Created.");
        return result;
    }

    public static void sendEvent(Object o) {
        engine.getEPRuntime().sendEvent(o);
    }

}
