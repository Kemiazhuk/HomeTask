package org.kemy.basicsOfOop.sixthTask.sweetStuf;

import org.kemy.basicsOfOop.sixthTask.Colors;
import org.kemy.basicsOfOop.sixthTask.Sweet;

import java.math.BigDecimal;

public class Lollipop extends Sweet {
    private Colors color;

    public Lollipop(String name, BigDecimal price, double calories, Colors color) {
        super(name, price, calories);
        this.color = color;
    }

    public static class Builder {
        private String name;
        private BigDecimal price;
        private double calories;
        private Colors color;

        public Lollipop build() {
            return new Lollipop(this.name, this.price, this.calories, this.color);
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

        public Builder withColor(Colors color) {
            this.color = color;
            return this;
        }
    }
}
