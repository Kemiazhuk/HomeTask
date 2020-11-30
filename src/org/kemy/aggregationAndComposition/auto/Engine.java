package org.kemy.aggregationAndComposition.auto;

public class Engine {
    private int engines;

    public Engine(int engines) {
        this.engines = engines;
    }

    @Override
    public String toString() {
        return engines + "";
    }

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }
}
