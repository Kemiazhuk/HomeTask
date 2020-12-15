package org.kemy.aggregationAndComposition.touristPackages;

import java.util.*;

public class AllPackages {
    private List<Package> allPackages;

    public AllPackages(List<Package> allPackages) {
        this.allPackages = allPackages;
    }

    public void sortByCost() {
        Collections.sort(allPackages, Comparator.comparing(Package::getPrice));
    }

    public ArrayList<Package> findPackagesWithNecessaryTransport(ArrayList<Package> aPackages, String [] transports) {
        ArrayList<Package> newPackages = new ArrayList<>();
        int i=0;
        for (Package pack : aPackages) {
            String tr = pack.getTransport();
            for (String s : transports) {
                if (tr.compareTo(s) == 0){
                    aPackages.add(pack);
                }
            }
        }
        return newPackages;
    }

    public ArrayList<Package> findPackagesWithNecessaryRest(String[] restNum) {
        ArrayList<Package> aPackages = new ArrayList<>();
        for (Package pack : allPackages) {
            String str = pack.getTypeOfRest();
            for (String st : restNum) {
                if (str.compareTo(st) == 0) {
                    aPackages.add(pack);
                }
            }

        }
        return aPackages;
    }

    public ArrayList<Package> findPackagesWithNecessaryDaysOfRest(ArrayList<Package> aPackages, int days) {
        ArrayList<Package> newPackages = new ArrayList<>();
        for (Package pack : aPackages) {
            if (pack.getDays() == days) {
                newPackages.add(pack);
            }
        }
        return newPackages;
    }

    public ArrayList<Package> findPackagesWithNecessaryFood(ArrayList<Package> aPackages, String [] food) {
        ArrayList<Package> newPackages = new ArrayList<>();
        for (Package pack : aPackages) {
            String f = pack.getFood();
            for(String s : food) {
                if (s.compareTo(f) == 0) {
                    newPackages.add(pack);
                }
            }
        }
        return newPackages;
    }
}
