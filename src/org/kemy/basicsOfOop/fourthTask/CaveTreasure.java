package org.kemy.basicsOfOop.fourthTask;

import org.kemy.Input;

import javax.swing.tree.TreeCellRenderer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class CaveTreasure {
    private ArrayList<Treasure> allTreasure;
    private Treasure mostExpensiveTreasure;
    private BigDecimal sum;

    public CaveTreasure() throws IOException {
        this.allTreasure = new ArrayList<>();
        createCaveTreasure();
    }

    private void createCaveTreasure() throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader("src/org/kemy/basicsOfOop/fourthTask/Cave.txt"));
        String str = buffer.readLine();
        while (str != null) {
            String[] treasureStr = str.split(" ");
            Treasure treasure = new Treasure(treasureStr[0], MaterialTreasure.valueOf(treasureStr[1]), new BigDecimal(treasureStr[2]));
            allTreasure.add(treasure);
            str = buffer.readLine();
        }
        findMostExpensiveTreasure();
        buffer.close();
    }

    public void addTreasure(Treasure treasure) {
        allTreasure.add(treasure);
        if (treasure.getCost().compareTo(mostExpensiveTreasure.getCost()) >= 0) {
            mostExpensiveTreasure = treasure;
        }
    }

    public void removeTreasure(Treasure treasure) {
        allTreasure.remove(treasure);
        if (mostExpensiveTreasure.equals(treasure)) {
            findMostExpensiveTreasure();
        }
    }

    public ArrayList<Treasure> caveShowHisTreasure() {
        return allTreasure;
    }

    private void findMostExpensiveTreasure() {
        if (allTreasure.size() > 0) {
            BigDecimal expensive = new BigDecimal("-1");
            for (Treasure t : allTreasure) {
                if (t.getCost().compareTo(expensive) >= 0) {
                    mostExpensiveTreasure = t;
                    expensive = t.getCost();
                }
            }
        }
    }

    public Treasure getMostExpensiveTreasure() {
        return mostExpensiveTreasure;
    }

    public ArrayList<Treasure> worthOfTreasures(BigDecimal searchSum) {
       sum = new BigDecimal("0");
        ArrayList<Treasure> tempTreasure = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < allTreasure.size(); i++) {
            index.add(i);
        }
        Collections.shuffle(index);
        boolean[] existTreasure;
        existTreasure = new boolean[allTreasure.size()];
        findSetTreasure(0, searchSum, existTreasure, index, tempTreasure);
        return tempTreasure;
    }

    private void findSetTreasure(int start, BigDecimal worth, boolean[] existTreasure, ArrayList<Integer> index, ArrayList<Treasure> tempTreasure) {

        if (sum.compareTo(worth) > 0) {
            return;
        }

        if (sum.compareTo(worth) == 0) {
            return;
        }


        for (int i = start; i < allTreasure.size(); i++) {
            if ((!existTreasure[index.get(i)])) {
                existTreasure[index.get(i)] = true;
                tempTreasure.add(allTreasure.get(index.get(i)));
                sum = sum.add(allTreasure.get(index.get(i)).getCost());
                findSetTreasure(index.get(i), worth, existTreasure, index, tempTreasure);
                if (sum.compareTo(worth) == 0) {
                    return;
                }
                existTreasure[index.get(i)] = false;
                tempTreasure.remove(allTreasure.get(index.get(i)));
                sum = sum.subtract(allTreasure.get(index.get(i)).getCost());
            }
        }


    }
}
