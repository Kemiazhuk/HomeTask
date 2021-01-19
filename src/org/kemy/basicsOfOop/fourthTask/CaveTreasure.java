package org.kemy.basicsOfOop.fourthTask;

import org.kemy.Input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class CaveTreasure {
    private ArrayList<Treasure> allTreasure;
    private ArrayList<Treasure> tempTreasure;
    private Treasure mostExpensiveTreasure;

    public CaveTreasure() throws IOException {
        this.allTreasure = new ArrayList<>();
        createCaveTreasure();
    }

    public void createCaveTreasure() throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader("src/org/kemy/basicsOfOop/fourthTask/Cave.txt"));
        String str = buffer.readLine();
        BigDecimal expensive = new BigDecimal("-1");
        for (Treasure t : allTreasure) {

        }
        while (str != null) {
            String[] treasureStr = str.split(" ");
            BigDecimal tempCost = new BigDecimal(treasureStr[2]);
            Treasure treasure = new Treasure(treasureStr[0], MaterialTreasure.valueOf(treasureStr[1]), tempCost);
            allTreasure.add(treasure);
            if (tempCost.compareTo(expensive) >= 0) {
                mostExpensiveTreasure = treasure;
                expensive = tempCost;
            }
            str = buffer.readLine();
        }
        buffer.close();
    }

    public void addTreasure(Treasure treasure) {
        allTreasure.add(treasure);
        if (treasure.getCost().compareTo(mostExpensiveTreasure.getCost()) >= 0) {
            mostExpensiveTreasure = treasure;
        }
    }

    public void removeTreasure(Treasure treasure) {

        if (mostExpensiveTreasure.equals(treasure)) {
            allTreasure.remove(treasure);
            findMostExpensiveTreasure();
        }

    }

    public void caveShowHisTreasure() {
        for (Treasure t : allTreasure) {
            System.out.println(t.toString());
        }
    }

    public void findMostExpensiveTreasure() {
        BigDecimal expensive = new BigDecimal("-1");
        for (Treasure t : allTreasure) {
            if (t.getCost().compareTo(expensive) >= 0) {
                mostExpensiveTreasure = t;
                expensive = t.getCost();
            }
        }
    }

    public Treasure getMostExpensiveTreasure() {
        return mostExpensiveTreasure;
    }

    public ArrayList<Treasure> worthOfTreasures(BigDecimal searchSum) {
        BigDecimal sum = new BigDecimal("0");
        tempTreasure = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < allTreasure.size(); i++) {
            index.add(i);
        }
        Collections.shuffle(index);
        boolean[] existTreasure;
        existTreasure = new boolean[allTreasure.size()];
//        findSetTreasure(0, sum, searchSum, existTreasure, index);
        return tempTreasure;
    }

//    public void find (BigDecimal searchSum){
//        int [][] result = new int [Integer.valueOf(String.valueOf(searchSum))][allTreasure.size()-1];
//
//    }
    public void findSetTreasure(int start, BigDecimal sum, BigDecimal worth, boolean[] existTreasure, ArrayList<Integer> index) {

        if (sum.compareTo(worth) > 0) {
            return;
        }

        if (sum.compareTo(worth) == 0) {
            for (Treasure t : tempTreasure) {
                System.out.println(t.toString());
            }
            return;
        }


        for (int i = start; i < allTreasure.size(); i++) {
            if (!existTreasure[index.get(i)]) {
                existTreasure[index.get(i)] = true;
                tempTreasure.add(allTreasure.get(index.get(i)));
                sum = sum.add(allTreasure.get(index.get(i)).getCost());

                findSetTreasure(index.get(i), sum, worth, existTreasure, index);
                existTreasure[index.get(i)] = false;
                tempTreasure.remove(allTreasure.get(index.get(i)));
                sum = sum.subtract(allTreasure.get(index.get(i)).getCost());
            }

        }


    }


    @Override
    public String toString() {
        return "CaveTreasure{" +
                "allTreasure=" + allTreasure.toString();
    }
}
