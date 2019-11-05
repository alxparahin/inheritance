package ru.sbrf.reboot.lesson12;

public class Polo extends Car implements DoorsControl, WindowsControl {

    public final static String manufacturer = "VW";

    public Polo() {
        //super.
        triggerAlarm();
    }

    public void turnRadio(boolean state) {
        System.out.println("Radio is now " + (state ? "ON" : "OFF"));
    }

    @Override
    public void engineStart() {
        if (!this.isEngineStarted()) {
            System.out.println("Polo engine is not started");
            super.engineStart();
        }
        System.out.println("Polo engine started!");
    }


    public static void setManufacturer(String manufacturer) {
        System.out.println("From Polo class " + manufacturer);
    }

    public void openDoors() {

    }

    public void closeDoors() {

    }

    public void lockDoors() {

    }

    public void unlockDoors() {

    }

    public void lockWindows() {

    }

    public void unlockWindows() {

    }

    public void openWindow() {

    }

    public void closeWindow() {

    }

//    private void test(){
//        this.
//    }
}
