package org.kemy.aggregationAndComposition.auto;

public class Auto {
    private Wheels wheels;
    private Engine engines;
    private String brandAuto;
    private int fuelLevel = 10;

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Auto(Wheels wheels, Engine engines, String brandAuto) {
        this.wheels = wheels;
        this.engines = engines;
        this.brandAuto = brandAuto;
    }

    public void actions() {
        String nameNewWheel = "Bridgestone";
        int numberChangeWheel = 3;
        wheels.changeWheel(numberChangeWheel, nameNewWheel);

        int addFuel = 33;
        pumpFuel(addFuel);


    }

    public void carGoes() {
        engines.startEngineCar();
        System.out.println("The car goes");
    }

    public void pumpFuel(int addFuel) {
        carGoes();
        engines.stopEngineCar();
        System.out.println("Pump Fuel");
        fuelLevel += addFuel;
        System.out.println("Level fuel = " + fuelLevel);
    }

    public String getBrandAuto() {
        return brandAuto;
    }
}
