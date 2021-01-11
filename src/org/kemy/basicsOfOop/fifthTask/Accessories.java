package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Accessories {
    private String name;
    private BigDecimal price;

    public Accessories(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
