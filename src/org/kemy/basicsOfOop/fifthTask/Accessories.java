package org.kemy.basicsOfOop.fifthTask;

import org.kemy.basicsOfOop.fifthTask.accessories.Tape;

import java.math.BigDecimal;

public class Accessories extends Product {
    private Colors color;

    public static class Builder<T extends Accessories.Builder> extends Product.Builder<T> {
        protected Colors color;

        public Accessories build() {
            return new Accessories(name, price, this.color);
        }

        public T withAccessoriesColor(Colors color) {
            this.color = color;
            return (T) this;
        }


    }

    public Accessories(String name, BigDecimal price, Colors color) {
        super(name, price);
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
