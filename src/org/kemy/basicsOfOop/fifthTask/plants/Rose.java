package org.kemy.basicsOfOop.fifthTask.plants;

import org.kemy.basicsOfOop.fifthTask.Plant;

import java.math.BigDecimal;

public class Rose extends Plant {
    private Colors color;
    private double lengthThorns;

    public static class Builder {
        private String name;
        private BigDecimal price;
        private double lengthStalk;
        private int freshness;
        private Colors color;
        private double lengthThorns;

        public Rose build() {
            return new Rose(this.name, this.price, this.lengthStalk, this.freshness, this.color, this.lengthThorns);
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            this.price = price;
            return this;
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

        public Builder withLengthThorns(double lengthThorns) {
            this.lengthThorns = lengthThorns;
            return this;
        }

    }

    public Rose(String name, BigDecimal price, double lengthStalk, int freshness, Colors color, Double lengthThorns) {
        super(name, price, lengthStalk, freshness);
        this.color = color;
        this.lengthThorns = lengthThorns;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getLengthThorns() {
        return lengthThorns;
    }

    public void setLengthThorns(double lengthThorns) {
        this.lengthThorns = lengthThorns;
    }
}
