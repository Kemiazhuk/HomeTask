package org.kemy.aggregationAndComposition.state;

import java.util.List;

public class Region {
    private String nameRegion;
    private List<District> district;

    public Region(String nameRegion, List<District> district) {
        this.nameRegion = nameRegion;
        this.district = district;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public List<District> getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return "nameRegion='" + nameRegion;
    }
}
