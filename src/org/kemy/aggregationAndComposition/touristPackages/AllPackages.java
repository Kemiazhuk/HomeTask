package org.kemy.aggregationAndComposition.touristPackages;

import java.util.*;

public class AllPackages {
    private List<Packages> allPackages;


    public AllPackages() {
    }

    public AllPackages(List<Packages> allPackages) {
        this.allPackages = allPackages;
    }

    public void sortByCost() {
        Collections.sort(allPackages, Comparator.comparing(Packages::getPrice));
    }

    public ArrayList<Packages> findPackagesWithNecessaryTransport(ArrayList<Packages> packages, String transport) {
        ArrayList<Packages> newPackages = new ArrayList<>();
        for (Packages pack : packages) {
            if (pack.getTransport().compareTo(transport) == 0) {
                newPackages.add(pack);
            }
        }
        return newPackages;
    }

    public ArrayList<Packages> findPackagesWithNecessaryRest(String rest) {
        ArrayList<Packages> packages = new ArrayList<>();
        for (Packages pack : allPackages) {
            if (pack.getTypeOfRest().compareTo(rest) == 0) {
                packages.add(pack);
            }
        }
        return packages;
    }

    public ArrayList<Packages>  findPackagesWithNecessaryDaysOfRest(ArrayList<Packages> packages, int days) {
        ArrayList<Packages> newPackages = new ArrayList<>();
        for (Packages pack : packages) {
            if (pack.getDays() == days) {
                newPackages.add(pack);
            }
        }
        return newPackages;
    }

    public ArrayList<Packages> findPackagesWithNecessaryFood(ArrayList<Packages> packages,String food) {
        ArrayList<Packages> newPackages = new ArrayList<>();
        for (Packages pack : packages) {
            if (pack.getFood().compareTo(food) == 0) {
                newPackages.add(pack);
            }
        }
        return newPackages;
    }
}
