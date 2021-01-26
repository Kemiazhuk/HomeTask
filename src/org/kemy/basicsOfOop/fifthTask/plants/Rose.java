package org.kemy.basicsOfOop.fifthTask.plants;

import org.kemy.basicsOfOop.fifthTask.Colors;
import org.kemy.basicsOfOop.fifthTask.Plant;

import java.math.BigDecimal;

public class Rose extends Plant {
    private double lengthThorns;


    public static class Builder extends Plant.Builder {
        public double lengthThorns;

        public static Builder create() {
            return new Rose.Builder();
        }

        public Rose build() {
            return new Rose(name, price, lengthStalk, freshness, color, this.lengthThorns);
        }

        public Builder withLengthThorns(double lengthThorns) {
            this.lengthThorns = lengthThorns;
            return this;
        }

    }



    public Rose(String name, BigDecimal price, double lengthStalk, int freshness, Colors color, Double lengthThorns) {
        super(name, price, lengthStalk, freshness, color);
        this.lengthThorns = lengthThorns;
    }


    public double getLengthThorns() {
        return lengthThorns;
    }

    public void setLengthThorns(double lengthThorns) {
        this.lengthThorns = lengthThorns;
    }
}
