package org.kemy.basicsOfOop.fifthTask.plants;

import org.kemy.basicsOfOop.fifthTask.Plant;

import java.math.BigDecimal;

public class Tulip extends Plant {
    private Colors color;
    private int flowerLeaves;

    public static class Builder {
        private String name;
        private BigDecimal price;
        private double lengthStalk;
        private int freshness;
        private Colors color;
        private int flowerLeaves;

        public Tulip build() {
            return new Tulip(this.name, this.price, this.lengthStalk, this.freshness, this.color, this.flowerLeaves);
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

        public Builder withFlowerLeaves(int flowerLeaves) {
            this.flowerLeaves = flowerLeaves;
            return this;
        }

    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getFlowerLeaves() {
        return flowerLeaves;
    }

    public void setFlowerLeaves(int flowerLeaves) {
        this.flowerLeaves = flowerLeaves;
    }

    public Tulip(String name, BigDecimal price, double lengthStalk, int freshness, Colors color, int flowerLeaves) {
        super(name, price, lengthStalk, freshness);
        this.color = color;
        this.flowerLeaves = flowerLeaves;
    }
}
