package org.kemy.aggregationAndComposition.touristPackages;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Arrays;


public class MainPack {
    public static void main(String[] args) {
        Package package1 = new Package(TypeOfRest.TOURISM, Transports.AIRPLANE, Food.WITHOUT_FOOD, 14, 499);
        Package package2 = new Package(TypeOfRest.TOURISM, Transports.BUS, Food.ALL_INCLUSIVE, 7, 200);
        Package package3 = new Package(TypeOfRest.HEALTH, Transports.TRAIN, Food.ALL_INCLUSIVE, 7, 299);
        Package package4 = new Package(TypeOfRest.SHOPPING, Transports.BUS, Food.BREAKFAST_AND_DINNER, 2, 10);

        AllPackages allPackages = new AllPackages(Arrays.asList(package1, package2, package3, package4));
        ArrayList<Package> packageForClient = new ArrayList();
        packageForClient.add(package1);
        packageForClient.add(package2);
        packageForClient.add(package3);
        packageForClient.add(package4);

        System.out.println("choose the rest : TOURISM, HEALTH, SHOPPING or NO_MATTER");
        String[] restStr = Input.inputStr().split(" ");
        if (restStr[0].compareTo("NO_MATTER") != 0) {
            packageForClient = allPackages.findPackagesWithNecessaryRest(restStr);
        }
        System.out.println("choose transport(s) BUS, AIRPLANE, TRAIN, SHIP or NO_MATTER");
        String[] transports = Input.inputStr().split(" ");
        if (transports[0].compareTo("NO_MATTER") != 0) {
            packageForClient = allPackages.findPackagesWithNecessaryTransport(packageForClient, transports);
        }
        System.out.println("Enter how many days of rest you need or NO_MATTER");
        String d = Input.inputStr();
        if (d.compareTo("NO_MATTER") != 0) {
            int days = Integer.valueOf(d);
            packageForClient = allPackages.findPackagesWithNecessaryDaysOfRest(packageForClient, days);
        }
        System.out.println("what food do you need ALL_INCLUSIVE, BREAKFAST, BREAKFAST_AND_DINNER, WITHOUT_FOOD;");
        String[] food = Input.inputStr().split(" ");
        if (food[0].compareTo("NO_MATTER") != 0) {
            packageForClient = allPackages.findPackagesWithNecessaryFood(packageForClient, food);
        }
        packageForClient = allPackages.sortByPrice(packageForClient);
        if (!packageForClient.isEmpty()) {
            for (Package p : packageForClient) {
                System.out.println(p.toString());
            }
        } else {
            System.out.println("Nothing found choose other parameter");
        }

    }
}
