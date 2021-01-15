package org.kemy.basicsOfOop.fourthTask;

import javax.swing.table.TableRowSorter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

public class CaveTreasure {
    private ArrayList<Treasure> allTreasure;
    private BigDecimal sum = new BigDecimal("0");
    private BigDecimal worth = new BigDecimal("0");
    private ArrayList<ArrayList<Treasure>> worthTreasure = new ArrayList<ArrayList<Treasure>>();
    private ArrayList<Treasure> tempTreasure = new ArrayList<>();
    private boolean[] existTreasure;

    public CaveTreasure(ArrayList<Treasure> allTreasure) {
        this.allTreasure = allTreasure;
    }

    public Treasure mostExpensiveTreasure() {
        BigDecimal expensive = new BigDecimal("-1");
        Treasure treasure = null;
        for (Treasure t : allTreasure) {
            if (t.getCost().compareTo(expensive) >= 0) {
                treasure = t;
                expensive = t.getCost();
            }
        }
        return treasure;
    }

    public ArrayList<ArrayList<Treasure>> worthOfTreasures(BigDecimal searchSum) {
        worth = searchSum;
        existTreasure = new boolean[allTreasure.size()];
        findSetTreasure(0);
        return worthTreasure;
    }

    public void findSetTreasure(int start) {
        if (sum.compareTo(worth) > 0) {
            return;
        }

        if (sum.compareTo(worth) == 0) {
            worthTreasure.add((ArrayList<Treasure>) tempTreasure.clone());
        }

        for (int i = start; i < allTreasure.size(); i++) {
            if (!existTreasure[i]) {
                existTreasure[i] = true;
                tempTreasure.add(allTreasure.get(i));
                sum = sum.add(allTreasure.get(i).getCost());

                findSetTreasure(i);
                existTreasure[i] = false;
                tempTreasure.remove(allTreasure.get(i));
                sum = sum.subtract(allTreasure.get(i).getCost());
            }

        }
    }


    @Override
    public String toString() {
        return "CaveTreasure{" +
                "allTreasure=" + allTreasure;
    }
}
