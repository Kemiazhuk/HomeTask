package org.kemy.basicsOfOop.fourthTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CaveTreasure {
    private ArrayList<Treasure> allTreasure;

    public CaveTreasure(ArrayList<Treasure> allTreasure) {
        this.allTreasure = allTreasure;
    }

    public Treasure moreExpensiveTreasure() {
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

    @Override
    public String toString() {
        return "CaveTreasure{" +
                "allTreasure=" + allTreasure;
    }
}
