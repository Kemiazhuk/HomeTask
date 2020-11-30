package org.kemy.aggregationAndComposition.bills;

import javafx.util.Pair;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllBankBills {

    private List<Bills> allBills;

    public AllBankBills(List<Bills> allBills) {
        this.allBills = allBills;
    }

    public List<Bills> sortByAccountAmount() {
        Collections.sort(allBills, Comparator.comparing(Bills::getAccountAmount));
        return allBills;
    }

    @Override
    public String toString() {
        return allBills + " ";
    }

    public double[] allAccountAmount() {
        double positiveSum = 0;
        double negativeSum = 0;
        double sum = 0;
        for (Bills q : allBills) {
            sum += q.getAccountAmount();
            if (q.getAccountAmount() > 0) {
                positiveSum += q.getAccountAmount();
            } else negativeSum += q.getAccountAmount();
        }
        double allSum[] = {sum, positiveSum, negativeSum};
        return allSum;
    }
}
