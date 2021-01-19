package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Plant extends Product  {

    private double lengthStalk;
    private int freshness;

    public Plant(String name, BigDecimal price, double lengthStalk, int freshness) {
        super(name, price);
        this.lengthStalk = lengthStalk;
        this.freshness = freshness;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return name + " ";
    }
}
