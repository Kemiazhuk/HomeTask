package org.kemy.aggregationAndComposition.touristPackages;

import org.kemy.Input;
import org.kemy.aggregationAndComposition.bills.AllBankBills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPack {
    public static void main(String[] args) {
        Packages packages1 = new Packages("tourism", "airplane", "no", 14, 499);
        Packages packages2 = new Packages("tourism", "bus", "all inclusive", 7, 200);
        Packages packages3 = new Packages("health", "train", "all inclusive", 9, 299);
        Packages packages4 = new Packages("shopping", "bus", "no", 2, 10);

        AllPackages allPackages = new AllPackages(Arrays.asList(packages1, packages2, packages3, packages4));
        allPackages.sortByCost();
        ArrayList<Packages> packagesForClient = new ArrayList<>();

        System.out.println("Enter what rest do you need");
        String rest = Input.inputStr();
        if (!allPackages.findPackagesWithNecessaryRest(rest).isEmpty()) {
            packagesForClient = allPackages.findPackagesWithNecessaryRest(rest);
            System.out.println(packagesForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }


        System.out.println("Enter transport");
        String transport = Input.inputStr();

        if (!allPackages.findPackagesWithNecessaryTransport(packagesForClient, transport).isEmpty()) {
            packagesForClient = allPackages.findPackagesWithNecessaryTransport(packagesForClient, transport);
            System.out.println(packagesForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }

        System.out.println("Enter how many days of rest you need");
        int days = Input.inputInt();

        if (!allPackages.findPackagesWithNecessaryDaysOfRest(packagesForClient, days).isEmpty()) {
            packagesForClient = allPackages.findPackagesWithNecessaryDaysOfRest(packagesForClient, days);
            System.out.println(packagesForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }

        System.out.println("what food do you need");
        String food = Input.inputStr();

        if (!allPackages.findPackagesWithNecessaryFood(packagesForClient,food).isEmpty()) {
            packagesForClient = allPackages.findPackagesWithNecessaryFood(packagesForClient,food);
            System.out.println(packagesForClient);
        } else {
            System.out.println("Nothing found choose other parameter");
        }

    }
}
