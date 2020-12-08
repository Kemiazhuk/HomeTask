package org.kemy.aggregationAndComposition.auto;

public class Engine {
    private int engines;

    public Engine(int engines) {
        this.engines = engines;
    }


    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public void startEngineCar() {
        System.out.println("Start engine");
    }

    public void stopEngineCar() {
        System.out.println("Stop engine");
    }
}
