package org.kemy.aggregationAndComposition.state;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private double square;
    private boolean capital;
    private boolean regionCenter;
    private boolean districtCenter;

    public City(String name, double square, boolean capital, boolean regionCenter, boolean districtCenter) {
        this.name = name;
        this.square = square;
        this.capital = capital;
        this.regionCenter = regionCenter;
        this.districtCenter = districtCenter;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public boolean isCapital() {
        return capital;
    }

    public boolean isRegionCenter() {
        return regionCenter;
    }

    public boolean isDistrictCenter() {
        return districtCenter;
    }
}
