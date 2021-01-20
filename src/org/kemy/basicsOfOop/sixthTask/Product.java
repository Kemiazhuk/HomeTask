package org.kemy.basicsOfOop.sixthTask;

import java.math.BigDecimal;

public class Product {
    public String name;
    public BigDecimal price;


    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return name + " ";

    }
}
