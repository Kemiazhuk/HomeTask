package org.kemy.aggregationAndComposition.state;

import java.util.List;

public class District {
    private String nameDistrict;
    private List <City> city;

    public District(String nameDistrict, List<City> city) {
        this.nameDistrict = nameDistrict;
        this.city = city;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public List<City> getCity() {
        return city;
    }
}
