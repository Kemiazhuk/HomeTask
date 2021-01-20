package org.kemy.basicsOfOop.sixthTask;

import java.math.BigDecimal;

public class Accessories extends Product {
    private Colors color;


    public Accessories(String name, BigDecimal price, Colors color) {
        super(name, price);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return color + " " + name;
    }
}

