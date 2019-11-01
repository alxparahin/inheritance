package ru.sbrf.reboot.lesson12;

public class Polo extends Car {

    public final static String manufacturer = "VW";

    public Polo() {
        //super.
        triggerAlarm();
    }

    @Override
    public void engineStart() {
        if (!this.isEngineStarted()) {
            System.out.println("Polo engine is not started");
            super.engineStart();
        }
        System.out.println("Polo engine started!");
    }

//    private void test(){
//        this.
//    }
}
