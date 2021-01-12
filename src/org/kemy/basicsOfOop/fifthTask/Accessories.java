package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Accessories extends Product implements Cloneable {
    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Accessories(String name, BigDecimal price, int quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }

    public static class Builder {
        private String name;
        private BigDecimal price;
        private int quantity;
        private String color;

        public Accessories build() {
            return new Accessories(this.name, this.price, this.quantity, this.color);
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

        public Builder withQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return quantity + " " + color + " " + name;
    }
}
