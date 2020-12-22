package org.kemy.aggregationAndComposition.touristPackages;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Arrays;


public class MainPack {
    public static void main(String[] args) {
        Package package1 = new Package(TypeOfRest.TOURISM, Transports.AIRPLANE, Food.WITHOUT_FOOD, 14, 499);
        Package package2 = new Package(TypeOfRest.TOURISM, Transports.BUS, Food.ALL_INCLUSIVE, 14, 200);
        Package package3 = new Package(TypeOfRest.HEALTH, Transports.TRAIN, Food.ALL_INCLUSIVE, 2, 299);
        Package package4 = new Package(TypeOfRest.SHOPPING, Transports.BUS, Food.BREAKFAST_AND_DINNER, 2, 10);

        AllPackages allPackages = new AllPackages(Arrays.asList(package1, package2, package3, package4));

        System.out.println("choose the rest : TOURISM HEALTH SHOPPING");
        String[] restStr = Input.inputStr().split(" ");
        System.out.println("choose transport(s) BUS AIRPLANE TRAIN SHIP");
        String[] transports = Input.inputStr().split(" ");
        System.out.println("Enter how many days of rest you need");
        String[] d = Input.inputStr().split(" ");
        System.out.println("what food do you need ALL_INCLUSIVE BREAKFAST BREAKFAST_AND_DINNER WITHOUT_FOOD");
        String[] food = Input.inputStr().split(" ");
        ArrayList <Package> packageForClient = allPackages.searchTouristPackages(Arrays.asList(restStr),
                Arrays.asList(transports), Arrays.asList(d),Arrays.asList(food));
        allPackages.sortByPrice(packageForClient);
        for (Package p: packageForClient){
            System.out.println(p.toString());
        }

    }
}
