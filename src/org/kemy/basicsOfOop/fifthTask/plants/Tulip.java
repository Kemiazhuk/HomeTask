package org.kemy.basicsOfOop.fifthTask.plants;

import org.kemy.basicsOfOop.fifthTask.Colors;
import org.kemy.basicsOfOop.fifthTask.Plant;

import java.math.BigDecimal;

public class Tulip extends Plant {
    private int flowerLeaves;

    public static class Builder extends Plant.Builder{
        protected int flowerLeaves;

        public Tulip build() {
            return new Tulip(name, price, lengthStalk, freshness, color, this.flowerLeaves);
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder withFlowerLeaves(int flowerLeaves) {
            this.flowerLeaves = flowerLeaves;
            return this;
        }

    }

    public int getFlowerLeaves() {
        return flowerLeaves;
    }

    public void setFlowerLeaves(int flowerLeaves) {
        this.flowerLeaves = flowerLeaves;
    }

    public Tulip(String name, BigDecimal price, double lengthStalk, int freshness, Colors color, int flowerLeaves) {
        super(name, price, lengthStalk, freshness, color);
        this.flowerLeaves = flowerLeaves;
    }
}
