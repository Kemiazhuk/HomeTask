package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Product {
    public String name;
    public BigDecimal price;
    public int quantity;


    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + name;

    }
}

