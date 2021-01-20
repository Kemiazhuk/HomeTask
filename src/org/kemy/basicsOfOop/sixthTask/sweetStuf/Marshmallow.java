package org.kemy.basicsOfOop.sixthTask.sweetStuf;

import org.kemy.basicsOfOop.sixthTask.Sweet;

import java.math.BigDecimal;

public class Marshmallow extends Sweet {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Marshmallow(String name, BigDecimal price, double calories, double size) {
        super(name, price, calories);
        this.size = size;
    }

    public static class Builder {
        private String name;
        private BigDecimal price;
        private double calories;
        private double size;

        public Marshmallow build() {
            return new Marshmallow(this.name, this.price, this.calories, this.size);
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

        public Builder withCalories(double calories) {
            this.calories = calories;
            return this;
        }

        public Builder withSize(double size) {
            this.size = size;
            return this;
        }
    }
}
