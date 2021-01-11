package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Plant extends Product {

    private double lengthStalk;
    private int freshness;

    public static class Builder {
        private Plant plant;

        public Builder() {
            plant = new Plant();
        }

        public Builder withName(String name) {
            plant.name = name;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            plant.price = price;
            return this;
        }

        public Builder withQuantity(int quantity) {
            plant.quantity = quantity;
            return this;
        }

        public Builder withLengthStalk(double lengthStalk) {
            plant.lengthStalk = lengthStalk;
            return this;
        }

        public Builder withFreshness(int freshness) {
            plant.freshness = freshness;
            return this;
        }

        public Product build() {
            return product;
        }

    }
//    public Plant(String name, double lengthStalk, int freshness, BigDecimal price, int quantity) {
//
//
//        this.lengthStalk = lengthStalk;
//        this.freshness = freshness;
//    }

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
