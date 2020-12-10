package org.kemy.aggregationAndComposition.auto;

public class MainAuto {
    public static void main(String[] args) {
        Wheels wheels = new Wheels(new String[]{"KAMA", "KAMA", "KAMA", "KAMA"}, 16);
        Engine engine = new Engine();
        Auto newAuto = new Auto(wheels, engine, "Fiat");
        newAuto.actions();
        System.out.println("Brand auto " + newAuto.getBrandAuto());
    }

}
