package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Plant extends Product implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private double lengthStalk;
    private int freshness;

    public Plant(String name, BigDecimal price, int quantity, double lengthStalk, int freshness) {
        super(name, price, quantity);
        this.lengthStalk = lengthStalk;
        this.freshness = freshness;
    }

    public static class Builder {
        private Plant plant;
        private String name;
        private BigDecimal price;
        private int quantity;
        private double lengthStalk;
        private int freshness;

        public Plant build() {
            plant = new Plant(this.name, this.price, this.quantity, this.lengthStalk, this.freshness);
            return plant;
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

        public Builder withLengthStalk(double lengthStalk) {
            this.lengthStalk = lengthStalk;
            return this;
        }

        public Builder withFreshness(int freshness) {
            this.freshness = freshness;
            return this;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengthStalk() {
        return lengthStalk;
    }

    public void setLengthStalk(double lengthStalk) {
        this.lengthStalk = lengthStalk;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " " + quantity;
    }
}
