package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Accessories extends Product {
    private String color;

    public Accessories(String name, BigDecimal price, int quantity, String color) {
        Product newProduct = new Product.Builder() .withName(name).withPrice(price).withQuantity(quantity).build();
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
        return quantity + " " +  color  + " " + name ;
    }
}
