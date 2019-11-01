package ru.sbrf.reboot.lesson12;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson12");
        Polo polo = new Polo();
        Car.setManufacturer("VAG");
        Polo.setManufacturer("BMW");
        System.out.println(Car.manufacturer);
        System.out.println(Polo.manufacturer);
        System.out.println(polo.isEngineStarted());
        if(!polo.isEngineStarted()) polo.engineStart();
        System.out.println(polo.isEngineStarted());
    }

}
