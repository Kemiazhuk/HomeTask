package org.kemy.aggregationAndComposition.touristPackages;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPack {
    public static void main(String[] args) {
        Package package1 = new Package("TOURISM", "AIRPLANE", "WITHOUT_FOOD", 14, 499);
        Package package2 = new Package("TOURISM", "BUS", "ALL_INCLUSIVE", 7, 200);
        Package package3 = new Package("HEALTH", "TRAIN", "ALL_INCLUSIVE", 9, 299);
        Package package4 = new Package("SHOPPING", "BUS", "BREAKFAST_AND_DINNER", 2, 10);

        AllPackages allPackages = new AllPackages(Arrays.asList(package1, package2, package3, package4));
        ArrayList<Package> packageForClient = new ArrayList();
        packageForClient.add(package1);
        packageForClient.add(package2);
        packageForClient.add(package3);
        packageForClient.add(package4);
        System.out.println("choose the rest : TOURISM, HEALTH, SHOPPING");
        String stringRest = Input.inputStr();

        if (stringRest.length() > 0) {
            String[] restStr = stringRest.split(" ");
            if (!allPackages.findPackagesWithNecessaryRest(restStr).isEmpty()) {
                packageForClient = allPackages.findPackagesWithNecessaryRest(restStr);
                System.out.println(packageForClient);
            } else {
                System.out.println("Nothing found choose other parameter");
            }
        }

        System.out.println("choose transport(s) BUS, AIRPLANE, TRAIN, SHIP");
        String[] transports = Input.inputStr().split(" ");

        if (!allPackages.findPackagesWithNecessaryTransport(packageForClient, transports).isEmpty()) {
            packageForClient = allPackages.findPackagesWithNecessaryTransport(packageForClient, transports);
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

        System.out.println("what food do you need ALL_INCLUSIVE, BREAKFAST, BREAKFAST_AND_DINNER, WITHOUT_FOOD;");
        String [] food = Input.inputStr().split(" ");

        if (!allPackages.findPackagesWithNecessaryFood(packageForClient, food).isEmpty()) {
            packageForClient = allPackages.findPackagesWithNecessaryFood(packageForClient, food);
            System.out.println(packageForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }
    }
}
