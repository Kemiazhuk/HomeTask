package org.kemy.aggregationAndComposition.touristPackages;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllPackages {
    private List<Packages> allPackages;

    public AllPackages(List<Packages> allPackages) {
        this.allPackages = allPackages;
    }

    public void sortByCost() {
        Collections.sort(allPackages, Comparator.comparing(Packages::getPrice));
    }

    public void findPackagesWithNecessaryTransport(String transport) {
        for (Packages pack : allPackages) {
            if (pack.getTransport().compareTo(transport) == 0) {
                System.out.println(pack.toString());
            }
        }
    }

    public void findPackagesWithNecessaryRest(String rest) {
        for (Packages pack : allPackages) {
            if (pack.getTypeOfRest().compareTo(rest) == 0) {
                System.out.println(pack.toString());
            }
        }
    }

    public void findPackagesWithNecessaryDaysOfRest(int days) {
        for (Packages pack : allPackages) {
            if (pack.getDays() == days) {
                System.out.println(pack.toString());
            }
        }
    }

    public void findPackagesWithNecessaryFood(String food) {
        for (Packages pack: allPackages){
            if (pack.getFood().compareTo(food) == 0)  {
                System.out.println(pack.toString());
            }
        }
    }
}
