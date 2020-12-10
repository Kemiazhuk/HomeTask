package org.kemy.aggregationAndComposition.touristPackages;

public class Packages {
    private String typeOfRest;
    private String transport;
    private String food;
    private int days;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Packages(String typeOfRest, String transport, String food, int days, int price) {
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

    public String getTypeOfRest() {
        return typeOfRest;
    }

    public void setTypeOfRest(String typeOfRest) {
        this.typeOfRest = typeOfRest;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
