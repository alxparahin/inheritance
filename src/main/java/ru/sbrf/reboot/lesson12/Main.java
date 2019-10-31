package ru.sbrf.reboot.lesson12;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson12");
        Polo polo = new Polo();
        System.out.println(polo.isEngineStarted());
        Polo.setManufacturer("VW");
        System.out.println(Polo.manufacturer);
    }

}
