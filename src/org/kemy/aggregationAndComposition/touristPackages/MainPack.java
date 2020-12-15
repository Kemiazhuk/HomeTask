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

        System.out.println("choose the rest : TOURISM, HEALTH, SHOPPING");
        String[] restStr = Input.inputStr().split(" ");

        System.out.println("choose transport(s) BUS, AIRPLANE, TRAIN, SHIP");
        String[] transports = Input.inputStr().split(" ");

        System.out.println("Enter how many days of rest you need");
        int days = Input.inputInt();

        System.out.println("what food do you need ALL_INCLUSIVE, BREAKFAST, BREAKFAST_AND_DINNER, WITHOUT_FOOD;");
        String[] food = Input.inputStr().split(" ");

        packageForClient = allPackages.findPackagesWithNecessaryRest(restStr);
        packageForClient = allPackages.findPackagesWithNecessaryTransport(packageForClient, transports);
        packageForClient = allPackages.findPackagesWithNecessaryDaysOfRest(packageForClient, days);
        packageForClient = allPackages.findPackagesWithNecessaryFood(packageForClient, food);
        if (!packageForClient.isEmpty()){
            System.out.println(packageForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }

    }
}
