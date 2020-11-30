package org.kemy.aggregationAndComposition.auto;

public class Wheel {
    private String wheels;

    public Wheel(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "wheels=" + wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
}
