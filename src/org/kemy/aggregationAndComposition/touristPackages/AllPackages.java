package org.kemy.aggregationAndComposition.touristPackages;

import java.util.*;

public class AllPackages {
    private List<Package> allPackages;

    public AllPackages(List<Package> allPackages) {
        this.allPackages = allPackages;
    }

    public ArrayList<Package> sortByPrice(ArrayList<Package> clientPack) {
        Collections.sort(clientPack, Comparator.comparing(Package::getPrice));
        return clientPack;
    }


    public ArrayList<Package> findPackagesWithNecessaryTransport(ArrayList<Package> aPackages, String [] transports) {
        ArrayList<Package> newPackages = new ArrayList<>();
        for (Package pack : aPackages) {
            Transports tr = pack.getTransport();
            for (String s : transports) {
                if (tr.compareTo(Transports.valueOf(s)) == 0){
                    newPackages.add(pack);
                }
            }
        }
        return newPackages;
    }

    public ArrayList<Package> findPackagesWithNecessaryRest(String[] restNum) {
        ArrayList<Package> aPackages = new ArrayList<>();
        for (Package pack : allPackages) {
            TypeOfRest str = pack.getTypeOfRest();
            for (String st : restNum) {
                if (str.compareTo(TypeOfRest.valueOf(st)) == 0) {
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
            Food f = pack.getFood();
            for(String s : food) {
                if (f.compareTo(Food.valueOf(s)) == 0) {
                    newPackages.add(pack);
                }
            }
        }
        return newPackages;
    }


}
