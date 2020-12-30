package org.kemy.aggregationAndComposition.touristPackages;

import java.math.BigDecimal;

public class Package {
    private TypeOfRest typeOfRest;
    private Transports transport;
    private Food food;
    private int days;
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }


    public Package(TypeOfRest typeOfRest, Transports transport, Food food, int days, BigDecimal price) {
        this.typeOfRest = typeOfRest;
        this.transport = transport;
        this.food = food;
        this.days = days;
        this.price = price;
    }

    @Override
    public String toString() {
        return typeOfRest +
                " by " + transport +
                " with " + food + " food " +
                " on " + days + " days " +
                " and cost " + price + "$";
    }

    public TypeOfRest getTypeOfRest() {
        return typeOfRest;
    }


    public Transports getTransport() {
        return transport;
    }


    public Food getFood() {
        return food;
    }


    public int getDays() {
        return days;
    }

}
