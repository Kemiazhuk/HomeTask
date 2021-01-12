package org.kemy.basicsOfOop.sixthTask;

import java.math.BigDecimal;

public class Sweet extends Product implements Cloneable {
    private String brandOfSweet;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Sweet(String name, BigDecimal price, int quantity, String brandOfSweet) {
        super(name, price, quantity);
        this.brandOfSweet = brandOfSweet;
    }

    public static class Builder {
        private Sweet sweet;
        private String name;
        private BigDecimal price;
        private int quantity;
        private String brandOfSweet;

        public Sweet build() {
            sweet = new Sweet (name, price, quantity, brandOfSweet);
            return sweet;
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

        public Builder withBrandOfSweet(String brandOfSweet) {
            this.brandOfSweet = brandOfSweet;
            return this;
        }
    }
}
