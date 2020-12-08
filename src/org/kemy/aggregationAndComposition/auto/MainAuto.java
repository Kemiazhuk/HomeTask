package org.kemy.aggregationAndComposition.auto;

public class MainAuto {
    public static void main(String[] args) {
        Wheels wheels = new Wheels(new String[]{"KAMA", "KAMA", "KAMA", "KAMA"}, 16);
        Engine engine = new Engine(30);
        Auto newAuto = new Auto(wheels, engine, "Fiat");

        String nameNewWheel = "Bridgestone";
        int numberChangeWheel = 3;
        newAuto.changeWheel(numberChangeWheel, nameNewWheel);
        newAuto.pumpFuel(33);
        System.out.println(newAuto.getBrandAuto());
    }

}
