package ru.sbrf.reboot.lesson12;

import java.awt.*;

public abstract class Car {

    public static String manufacturer;
    public final static int maxAge = 10;

    private boolean isAlarmActive;
    private boolean isEngineStarted;
    protected Color color;
    int age;
    public final static boolean ON = true;
    public final static boolean OFF = false;

    public abstract void turnRadio(boolean state);

    public boolean isEngineStarted() {
        return isEngineStarted;
    }

    public void engineStart(){
        if (!isEngineStarted) {
            System.out.println("Starting engine on " + this);
            if(isAlarmActive) {
                System.out.println("Alarm is " + (isAlarmActive ? "ON" : "OFF"));
                triggerAlarm();
            }
            System.out.println("Alarm is " + (isAlarmActive ? "ON" : "OFF"));
            isEngineStarted = true;
            turnRadio(ON);
        }
    }

    private boolean isAlarmActive(){
        return isAlarmActive;
    }

    public void triggerAlarm() {
        if(!this.getClass().equals(Car.class) && isAlarmActive) System.out.println("Object of " + this.getClass() + " can not turn the alarm off!");
        else isAlarmActive = !isAlarmActive;
        System.out.println("Alarm is triggered and now is " + (isAlarmActive ? "ON" : "OFF"));
    }

    private boolean checkEngineStatus(boolean status) {
        return isEngineStarted == status;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        System.out.println("From Car class " + manufacturer);
    }

}
