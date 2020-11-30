package org.kemy.aggregationAndComposition.auto;

import org.kemy.Input;

public class Auto {
    private Wheel wheel;
    private Engine engines;
    private String brandAuto;

    public Auto(Wheel wheel, Engine engines, String brandAuto) {
        this.wheel = wheel;
        this.engines = engines;
        this.brandAuto = brandAuto;
    }

    public void changeWheels (Wheel newWheel){
     this.wheel = newWheel;
        System.out.println("Change wheels on " + wheel.toString());
    }

    public void drive (){
        System.out.println("Drive car");
    }

    public void pumpFuel(int engine){
        int level = engines.getEngines()+engine;
        engines.setEngines(level);
        System.out.println("Level fuel = " + engines.toString());
    }

    public String getBrandAuto() {
        return brandAuto;
    }
}
