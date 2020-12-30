package org.kemy.aggregationAndComposition.touristPackages;

import org.kemy.taskClass.triangle.Triangle;

import java.util.*;

public class AllPackages {
    private List<Package> allPackages;

    @Override
    public String toString() {
        return allPackages.toString();
    }

    public AllPackages(List<Package> allPackages) {
        this.allPackages = allPackages;
    }

    public ArrayList<Package> searchTouristPackages(ArrayList<TypeOfRest> rest, ArrayList<Transports> transport, int min, int max, ArrayList<Food> food) {
        ArrayList<Package> packagesForTourist = new ArrayList<>();
        for (Package pack : allPackages) {
            if (rest.contains(pack.getTypeOfRest()) && (transport.contains(pack.getTransport())) &&
                    (pack.getDays() >= min) && (pack.getDays() <= max) && (food.contains(pack.getFood()))) {
                packagesForTourist.add(pack);
            }

        }
        return packagesForTourist;
    }

    public ArrayList<Package> sortByPrice(ArrayList<Package> clientPack) {
        Collections.sort(clientPack, Comparator.comparing(Package::getPrice));
        return clientPack;
    }
}
