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
        BufferedReader buffer = new BufferedReader(new FileReader("src/org/kemy/basicsOfOop/fourthTask/Cave.txt"));
        String str = buffer.readLine();
        ArrayList<Treasure> allTreasure = new ArrayList<>();
        while (str != null) {
            String[] treasureStr = str.split(" ");
            Treasure treasure = new Treasure(treasureStr[0], treasureStr[1], new BigDecimal(treasureStr[2]));
            allTreasure.add(treasure);
            str = buffer.readLine();
        }

        buffer.close();

        CaveTreasure caveTreasure = new CaveTreasure(allTreasure);
        System.out.println("All treasure");
        for (Treasure t : allTreasure) {
            System.out.println(t.toString());
        }
        System.out.println("More expensive treasure is:");
        System.out.println(caveTreasure.mostExpensiveTreasure().toString());

        System.out.println("enter how much many you have for a treasure");

        ArrayList<ArrayList<Treasure>> setOfTreasure = caveTreasure.worthOfTreasures(Input.inputBigDec());
//        for (ArrayList<Treasure> t : setOfTreasure) {
//            System.out.println(t.toString());
//        }
        Random rnd = new Random(System.currentTimeMillis());
        System.out.println(setOfTreasure.get(rnd.nextInt(setOfTreasure.size())));
    }
}