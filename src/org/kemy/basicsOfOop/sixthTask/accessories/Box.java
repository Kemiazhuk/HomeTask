package org.kemy.basicsOfOop.sixthTask.accessories;

import org.kemy.basicsOfOop.sixthTask.Accessories;
import org.kemy.basicsOfOop.sixthTask.Colors;

import java.math.BigDecimal;

public class Box extends Accessories {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Box(String name, BigDecimal price, Colors color, double volume) {
        super(name, price, color);
        this.volume = volume;
    }

    public static class Builder {
        private String name;
        private BigDecimal price;
        private Colors color;
        private double volume;

        public Box build() {
            return new Box(this.name, this.price, this.color, this.volume);
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


        public Builder withColor(Colors color) {
            this.color = color;
            return this;
        }

        public Builder withVolume(double volume) {
            this.volume = volume;
            return this;
        }

    }
}
