package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Plant extends Product {

    private double lengthStalk;
    private int freshness;
    private Colors color;

    public Plant(String name, BigDecimal price, double lengthStalk, int freshness, Colors color) {
        super(name, price);
        this.lengthStalk = lengthStalk;
        this.freshness = freshness;
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getLengthStalk() {
        return lengthStalk;
    }

    public void setLengthStalk(double lengthStalk) {
        this.lengthStalk = lengthStalk;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }


}
