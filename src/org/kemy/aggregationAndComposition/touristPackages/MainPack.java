package org.kemy.aggregationAndComposition.touristPackages;

import org.kemy.Input;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;


public class MainPack {
    public static void main(String[] args) {
        Package package1 = new Package(TypeOfRest.TOURISM, Transports.AIRPLANE, Food.WITHOUT_FOOD, 14, BigDecimal.valueOf(499));
        Package package2 = new Package(TypeOfRest.TOURISM, Transports.BUS, Food.ALL_INCLUSIVE, 14, BigDecimal.valueOf(200));
        Package package3 = new Package(TypeOfRest.HEALTH, Transports.TRAIN, Food.ALL_INCLUSIVE, 2, BigDecimal.valueOf(299));
        Package package4 = new Package(TypeOfRest.SHOPPING, Transports.BUS, Food.BREAKFAST_AND_DINNER, 2, BigDecimal.valueOf(10));

        AllPackages allPackages = new AllPackages(Arrays.asList(package1, package2, package3, package4));
        ArrayList<TypeOfRest> rest = new ArrayList<>();
        ArrayList<Transports> transports = new ArrayList<>();
        ArrayList<Food> food = new ArrayList<>();

        System.out.println("choose the rest : TOURISM HEALTH SHOPPING");
        String[] temp = Input.inputStr().split(" ");
        for (String s : temp) {
            rest.add(TypeOfRest.valueOf(s));
        }
        System.out.println("choose transport(s) BUS AIRPLANE TRAIN SHIP");
        temp = Input.inputStr().split(" ");
        for (String s : temp) {
            transports.add(Transports.valueOf(s));
        }
        System.out.println("Enter how many days of rest you need Min");
        int min = Input.inputInt();
        System.out.println("Enter how many days of rest you need Max");
        int max = Input.inputInt();
        System.out.println("what food do you need ALL_INCLUSIVE BREAKFAST BREAKFAST_AND_DINNER WITHOUT_FOOD");
        temp = Input.inputStr().split(" ");
        for (String s : temp) {
            food.add(Food.valueOf(s));
        }
        ArrayList<Package> packageForClient = allPackages.searchTouristPackages(rest, transports, min, max, food);
        allPackages.sortByPrice(packageForClient);
        for (Package p : packageForClient) {
            System.out.println(p.toString());
        }

    }
}
