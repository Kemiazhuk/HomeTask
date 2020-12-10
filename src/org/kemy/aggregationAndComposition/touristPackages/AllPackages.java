package org.kemy.aggregationAndComposition.touristPackages;

import java.util.*;

public class AllPackages {
    private List<Package> allPackages;


    public AllPackages() {
    }

    public AllPackages(List<Package> allPackages) {
        this.allPackages = allPackages;
    }

    public void sortByCost() {
        Collections.sort(allPackages, Comparator.comparing(Package::getPrice));
    }

    public ArrayList<Package> findPackagesWithNecessaryTransport(ArrayList<Package> aPackages, String transport) {
        ArrayList<Package> newPackages = new ArrayList<>();
        for (Package pack : aPackages) {
            if (pack.getTransport().compareTo(transport) == 0) {
                newPackages.add(pack);
            }
        }
        return newPackages;
    }

    public ArrayList<Package> findPackagesWithNecessaryRest(String rest) {
        ArrayList<Package> aPackages = new ArrayList<>();
        for (Package pack : allPackages) {
            if (pack.getTypeOfRest().compareTo(rest) == 0) {
                aPackages.add(pack);
            }
        }
        return aPackages;
    }

    public ArrayList<Package>  findPackagesWithNecessaryDaysOfRest(ArrayList<Package> aPackages, int days) {
        ArrayList<Package> newPackages = new ArrayList<>();
        for (Package pack : aPackages) {
            if (pack.getDays() == days) {
                newPackages.add(pack);
            }
        }
        return newPackages;
    }

    public ArrayList<Package> findPackagesWithNecessaryFood(ArrayList<Package> aPackages, String food) {
        ArrayList<Package> newPackages = new ArrayList<>();
        for (Package pack : aPackages) {
            if (pack.getFood().compareTo(food) == 0) {
                newPackages.add(pack);
            }
        }
        return newPackages;
    }
}
