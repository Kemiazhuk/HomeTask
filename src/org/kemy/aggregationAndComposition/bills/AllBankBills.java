package org.kemy.aggregationAndComposition.bills;

import javafx.util.Pair;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllBankBills {
    private ArrayList<Bills> allBills = new ArrayList<>();

    public AllBankBills() {
    }

    public void addNewBill(Bills bill) {
        allBills.add(bill);
    }

    public ArrayList<Bills> sortByAccountAmount() {
        Collections.sort(allBills, Comparator.comparing(Bills::getAccountAmount));
        return allBills;
    }

    public int lastBillId() {
        return allBills.get(allBills.size() - 1).getId();
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

    public List<Integer> findAllBillsByNameCustomer(String name) {
        List<Integer> idList = new ArrayList<>();
        for (Bills b : allBills) {
            if (b.getNameCustomer().compareTo(name) == 0) {
                idList.add(b.getId());
            }
        }
        return idList;
    }

    public void findToLockUnlock(int id) {
        for (Bills b : allBills) {
            if (b.getId() == id){
                b.lockUnlock();
            }
        }
    }
}
