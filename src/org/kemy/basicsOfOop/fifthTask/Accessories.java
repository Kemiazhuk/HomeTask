package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Accessories extends Product  {
    private Colors color;


    public Accessories(String name, BigDecimal price, Colors color) {
        super(name, price);
        this.color = color;
    }



    @Override
    public String toString() {
        return " " + color + " " + name;
    }
}
