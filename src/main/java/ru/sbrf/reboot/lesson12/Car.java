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
            if(isAlarmActive) triggerAlarm();
            isEngineStarted = true;
        }
    }

    private boolean isAlarmActive(){
        return isAlarmActive;
    }

    public void triggerAlarm() {
        isAlarmActive = !isAlarmActive;
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
