package ru.sbrf.reboot.lesson12;

import java.awt.*;

public class Car {

    public static String manufacturer;
    public final static int maxAge = 10;

    private boolean isAlarmActive;
    private boolean isEngineStarted;
    protected Color color;
    int age;

    public boolean isEngineStarted() {
        return isEngineStarted;
    }

    public void engineStart(){
        if (!isEngineStarted) {
            System.out.println("Starting engine on " + this);
            if(isAlarmActive) {
                System.out.println("Alarm is " + isAlarmActive);
                triggerAlarm();
            }
            System.out.println("Alarm is " + isAlarmActive);
            isEngineStarted = true;
        }
    }

    private boolean isAlarmActive(){
        return isAlarmActive;
    }

    public void triggerAlarm() {
        if(!this.getClass().equals(Car.class) && isAlarmActive) System.out.println(this.getClass() + " can not turn the alarm off!");
        else isAlarmActive = !isAlarmActive;
        System.out.println("Alarm is triggered and now is " + isAlarmActive);
    }

    private boolean checkEngineStatus(boolean status) {
        return isEngineStarted == status;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Car.manufacturer = manufacturer;
    }

}
