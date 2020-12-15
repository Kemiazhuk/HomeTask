package org.kemy.aggregationAndComposition.touristPackages;

public class Package {
    private TypeOfRest typeOfRest;
    private Transports transport;
    private Food food;
    private int days;
    private int price;

    public int getPrice() {
        return price;
    }


    public Package(TypeOfRest typeOfRest, Transports transport, Food food, int days, int price) {
        this.typeOfRest = typeOfRest;
        this.transport = transport;
        this.food = food;
        this.days = days;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "typeOfRest='" + typeOfRest + '\'' +
                ", transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", days=" + days;
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
