package org.kemy.aggregationAndComposition.auto;

public class Auto {
    private Wheels wheels;
    private Engine engines;
    private String brandAuto;

    public Auto(Wheels wheels, Engine engines, String brandAuto) {
        this.wheels = wheels;
        this.engines = engines;
        this.brandAuto = brandAuto;
    }

    public void changeWheel(int number, String name) {
        takeOffWheel(number);
        String[] newStr = wheels.getWheelsName();
        newStr[number] = name;
        System.out.println("put on a new wheel");
        wheels.setWheelsName(newStr);
        System.out.println(wheels.toString());

    }

    public void takeOffWheel(int number){
        System.out.println("Take of " + number + " wheel");
    }




    public void drive() {
        System.out.println("Drive car");
    }

    public void pumpFuel(int engine) {
        engines.startEngineCar();
        drive();
        engines.stopEngineCar();
        System.out.println("Pump Fuel");
        int level = engines.getEngines() + engine;
        engines.setEngines(level);
        System.out.println("Level fuel = " + engines.toString());
    }

    public String getBrandAuto() {
        return brandAuto;
    }
}
