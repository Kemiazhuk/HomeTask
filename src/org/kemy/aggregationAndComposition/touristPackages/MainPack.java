package org.kemy.aggregationAndComposition.touristPackages;

import org.kemy.Input;
import java.util.Arrays;

public class MainPack {
    public static void main(String[] args) {
        Packages packages1 = new Packages("tourism", "airplane", "no", 14, 499);
        Packages packages2 = new Packages("tourism", "bus", "all inclusive", 7, 200);
        Packages packages3 = new Packages("health", "train", "all inclusive", 9,299);
        Packages packages4 = new Packages("shoping", "bus", "no", 2,10);

        AllPackages allPackages = new AllPackages(Arrays.asList(packages1, packages2, packages3, packages4));
        allPackages.sortByCost();
        System.out.println("Enter transport");
        String trasport = Input.inputStr();
        allPackages.findPackagesWithNecessaryTransport(trasport);
        System.out.println("Enter how many days of rest you need");
        int days = Input.inputInt();
        allPackages.findPackagesWithNecessaryDaysOfRest(days);
        System.out.println("Enter what rest do you need");
        String rest= Input.inputStr();
        allPackages.findPackagesWithNecessaryRest(rest);
        System.out.println("what food do you need");
        String food = Input.inputStr();
        allPackages.findPackagesWithNecessaryFood(food);

    }
}
