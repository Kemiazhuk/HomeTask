package org.kemy.aggregationAndComposition.auto;

public class MainAuto {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Kuma");
        Engine engine = new Engine(30);
        Auto newAuto = new Auto(wheel,engine,"Fiat");

        Wheel wheel1 = new Wheel("Belshina");

        newAuto.changeWheels(wheel1);
        newAuto.drive();
        newAuto.pumpFuel(33);
        System.out.println(newAuto.getBrandAuto());
    }

}
