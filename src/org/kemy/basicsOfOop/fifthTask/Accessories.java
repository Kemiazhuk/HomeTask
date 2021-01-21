package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Accessories extends Product {
    private Colors color;


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
