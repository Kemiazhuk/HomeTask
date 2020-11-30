package org.kemy.aggregationAndComposition.state;

import java.util.List;

public class State {

    private List<Region> region;

    public State(List<Region> region) {
        this.region = region;
    }

    public List<Region> getRegion() {
        return region;
    }

    public String findCapital() {
        for (Region r : region) {
            for (District d : r.getDistrict()) {
                for (City c : d.getCity()) {
                    if (c.isCapital()) {
                        return c.getName();
                    }
                }
            }
            ;
        }
        return "Don't find the capital";
    }

    public void square() {
        for (Region r : region) {
            for (District d : r.getDistrict()) {
                for (City c : d.getCity()) {
                    System.out.println(c.getSquare());
                }
            }
        }
    }

    public void findRegionCenter() {
        for (Region r : region) {
            for (District d : r.getDistrict()) {
                for (City c : d.getCity()) {
                    if (c.isRegionCenter()) {
                        System.out.println(c.getName());
                    }
                }
            }
        }
    }

}
