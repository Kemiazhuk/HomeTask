package org.kemy.aggregationAndComposition.touristPackages;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPack {
    public static void main(String[] args) {
        Package package1 = new Package("tourism", "airplane", "no", 14, 499);
        Package package2 = new Package("tourism", "bus", "all inclusive", 7, 200);
        Package package3 = new Package("health", "train", "all inclusive", 9, 299);
        Package package4 = new Package("shopping", "bus", "no", 2, 10);

        AllPackages allPackages = new AllPackages(Arrays.asList(package1, package2, package3, package4));
        allPackages.sortByCost();
        ArrayList<Package> packageForClient = new ArrayList<>();

        System.out.println("Enter what rest do you need");
        String rest = Input.inputStr();
        if (!allPackages.findPackagesWithNecessaryRest(rest).isEmpty()) {
            packageForClient = allPackages.findPackagesWithNecessaryRest(rest);
            System.out.println(packageForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }


        System.out.println("Enter transport");
        String transport = Input.inputStr();

        if (!allPackages.findPackagesWithNecessaryTransport(packageForClient, transport).isEmpty()) {
            packageForClient = allPackages.findPackagesWithNecessaryTransport(packageForClient, transport);
            System.out.println(packageForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }

        System.out.println("Enter how many days of rest you need");
        int days = Input.inputInt();

        if (!allPackages.findPackagesWithNecessaryDaysOfRest(packageForClient, days).isEmpty()) {
            packageForClient = allPackages.findPackagesWithNecessaryDaysOfRest(packageForClient, days);
            System.out.println(packageForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }

        System.out.println("what food do you need");
        String food = Input.inputStr();

        if (!allPackages.findPackagesWithNecessaryFood(packageForClient,food).isEmpty()) {
            packageForClient = allPackages.findPackagesWithNecessaryFood(packageForClient,food);
            System.out.println(packageForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }

    }
}
