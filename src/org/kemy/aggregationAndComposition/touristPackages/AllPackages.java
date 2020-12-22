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

    public ArrayList<Package> searchTouristPackages(List<String> rest, List<String> transport, List<String> day, List<String> food) {
        ArrayList<Package> packagesForTourist = new ArrayList<>();
        for (Package pack : allPackages) {
            TypeOfRest packTypeOfRest = pack.getTypeOfRest();
            Transports packTransport = pack.getTransport();
            Food packFood = pack.getFood();
            int packDays = pack.getDays();
            if (rest.contains(String.valueOf(packTypeOfRest))&&(transport.contains(String.valueOf(packTransport)))&&
                    (day.contains(String.valueOf(packDays)))&&(food.contains(String.valueOf(packFood)))) {
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
