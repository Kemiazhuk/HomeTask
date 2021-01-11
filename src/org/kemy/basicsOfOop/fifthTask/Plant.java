package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Plant {
    private String name;
    private double lengthStalk;
    private int freshness;
    private BigDecimal price;
    private int quantity;

    public Plant(String name, double lengthStalk, int freshness, BigDecimal price, int quantity) {
        this.name = name;
        this.lengthStalk = lengthStalk;
        this.freshness = freshness;
        this.price = price;
        this.quantity = quantity;
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
        return  name +"  " + lengthStalk +
                " length quantity ="+quantity ;
    }
}
