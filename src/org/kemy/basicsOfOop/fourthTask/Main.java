package org.kemy.basicsOfOop.fourthTask;

import org.kemy.Input;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        CaveTreasure caveTreasure = new CaveTreasure();
        int i = 0;

        while (i != 4) {
            if (caveTreasure.caveShowHisTreasure() == null) {
                System.out.println("At this moment cave is empty. Come later");
                i = 4;
            } else {
                System.out.println("You in a cave, what do you want to do?");
                System.out.println("1. See all treasure");
                System.out.println("2. See most expensive treasure");
                System.out.println("3. Choose treasures for the required amount");
                System.out.println("4. Exit");
                i = Input.inputInt();
                if (i == 1) {
                    System.out.println("All treasure");
                    for (Treasure t : caveTreasure.caveShowHisTreasure()) {
                        System.out.println(t.toString());
                    }
                } else if (i == 2) {
                    System.out.println("More expensive treasure is:");
                    System.out.println(caveTreasure.getMostExpensiveTreasure());
                } else if (i == 3) {
                    System.out.println("Enter how much money you have for a treasure");
                    ArrayList<Treasure> treasureForClint = caveTreasure.worthOfTreasures(Input.inputBigDec());
                    if (treasureForClint.size() > 0) {
                        for (Treasure t : treasureForClint) {
                            System.out.println(t.toString());
                        }
                        System.out.println("If you will take this treasure enter 0, if not enter 1");
                        int k = Input.inputInt();
                        if (k == 0) {
                            for (Treasure t : treasureForClint) {
                                caveTreasure.removeTreasure(t);
                            }
                        }
                    } else {
                        System.out.println("There is no treasure for this money");
                    }
                } else if ((i != 1) && (i != 2) && (i != 3) && (i != 4)) {
                    System.out.println("Enter the required number");
                }
            }
        }
    }

}


