package org.kemy.basicsOfOop.fifthTask.plants;

import org.kemy.basicsOfOop.fifthTask.Colors;
import org.kemy.basicsOfOop.fifthTask.Plant;

import java.math.BigDecimal;

public class Peony extends Plant {
    private int buds;

    public static class Builder {
        private String name;
        private BigDecimal price;
        private double lengthStalk;
        private int freshness;
        private Colors color;
        private int buds;

        public Peony build() {
            return new Peony(this.name, this.price, this.lengthStalk, this.freshness, this.color, this.buds);
        }

        public static Peony.Builder create() {
            return new Peony.Builder();
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

        public Builder withBuds(int buds) {
            this.buds = buds;
            return this;
        }

    }

    public int getBuds() {
        return buds;
    }

    public void setBuds(int buds) {
        this.buds = buds;
    }

    public Peony(String name, BigDecimal price, double lengthStalk, int freshness, Colors color, int buds) {
        super(name, price, lengthStalk, freshness, color);
        this.buds = buds;
    }
}
