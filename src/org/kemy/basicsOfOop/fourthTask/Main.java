package org.kemy.basicsOfOop.fourthTask;

import org.kemy.Input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {


        CaveTreasure caveTreasure = new CaveTreasure();
        int i = 0;
        while (i != 4) {
            System.out.println("You in a cave, what do you want to do?");
            System.out.println("1. See all treasure");
            System.out.println("2. See most expensive treasure");
            System.out.println("3. Choose treasures for the required amount");
            System.out.println("4. Exit");
            i = Input.inputInt();
            if (i == 1) {
                System.out.println("All treasure");
                caveTreasure.caveShowHisTreasure();
            }
            if (i == 2) {
                System.out.println("More expensive treasure is:");
                System.out.println(caveTreasure.getMostExpensiveTreasure());
            }
            if (i == 3) {
                System.out.println("Enter how much many you have for a treasure");
                ArrayList<Treasure> treasureForClint = caveTreasure.worthOfTreasures(Input.inputBigDec());
                if (treasureForClint.size()>0) {
                    for (Treasure t: treasureForClint)
                    System.out.println(t.toString());
                } else {
                    System.out.println("There is no treasure for this money");
                }
//                Random rnd = new Random(System.currentTimeMillis());
//                System.out.println(setOfTreasure.get(rnd.nextInt(setOfTreasure.size())));
            }
            if ((i != 1)&&(i != 2) && (i != 3) && (i != 4)) {
                System.out.println("Enter the required number");
            }
        }


//        for (ArrayList<Treasure> t : setOfTreasure) {
//            System.out.println(t.toString());
//        }

    }
}