package org.kemy.basicsOfOop.fifthTask.plants;

import org.kemy.basicsOfOop.fifthTask.Colors;
import org.kemy.basicsOfOop.fifthTask.Plant;

import java.math.BigDecimal;

public class Peony extends Plant {
    private int buds;

    public static class Builder extends Plant.Builder<Builder> {
        private int buds;

        public Peony build() {
            return new Peony(name, price, lengthStalk, freshness, color, this.buds);
        }

        public static Peony.Builder create() {
            return new Peony.Builder();
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
