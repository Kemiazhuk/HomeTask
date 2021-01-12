package org.kemy.basicsOfOop.fourthTask;

import org.kemy.Input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader("src/org/kemy/basicsOfOop/fourthTask/Cave.txt"));
        StringBuilder builder = new StringBuilder();
        String str = buffer.readLine();
        ArrayList <Treasure> allTreasure= new ArrayList<>();
        while (str != null) {
            String[] treasureStr = str.split(" ");
            Treasure  treasure = new Treasure(treasureStr[0],treasureStr[1], new BigDecimal(treasureStr[2]));
            allTreasure.add(treasure);
            builder.append('\n');
            str = buffer.readLine();

        }
        buffer.close();

        CaveTreasure caveTreasure = new CaveTreasure(allTreasure);
        System.out.println("All treasure");
        for (Treasure t: allTreasure) {
            System.out.println(t.toString());
        }
        System.out.println("More expensive treasure is:");
        System.out.println(caveTreasure.moreExpensiveTreasure().toString());




    }
}
