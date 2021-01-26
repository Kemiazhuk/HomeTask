package org.kemy.basicsOfOop.fifthTask;

import org.kemy.basicsOfOop.fifthTask.plants.Peony;

import java.math.BigDecimal;

public class Plant extends Product {
    private double lengthStalk;
    private int freshness;
    private Colors color;


    public static class Builder extends Product.Builder {
        public double lengthStalk;
        public int freshness;
        public Colors color;

        public Plant build() {
            return new Plant(name, price, this.lengthStalk, this.freshness, this.color);
        }

        public Builder withLengthStalk(double lengthStalk) {
            this.lengthStalk = lengthStalk;
            return this;
        }

        public Builder withFreshness(int freshness) {
            this.freshness = freshness;
            return this;
        }

        public Builder withColor(Colors color) {
            this.color = color;
            return this;
        }

//        public static Builder create() {
//            return new Plant.Builder();
//        }
    }


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
