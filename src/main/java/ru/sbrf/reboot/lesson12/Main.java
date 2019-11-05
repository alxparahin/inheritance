package ru.sbrf.reboot.lesson12;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson12");
        Polo polo = new Polo();
        Car.setManufacturer("VAG");
        Polo.setManufacturer("VW");
        System.out.println(Car.manufacturer);
        System.out.println(Polo.manufacturer);
        polo.unlockDoors();
        polo.openDoors();
        polo.unlockWindows();

        DoorsControl doorsPolo = polo;
        doorsPolo.closeDoors();
        doorsPolo.lockDoors();

        System.out.println(polo.isEngineStarted());
        if(!polo.isEngineStarted()) polo.engineStart();
        System.out.println(polo.isEngineStarted());
    }

}
