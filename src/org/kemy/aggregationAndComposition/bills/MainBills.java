package org.kemy.aggregationAndComposition.bills;

import javafx.util.Pair;

import java.util.Arrays;

public class MainBills {
    public static void main(String[] args) {

        Bills bills1 = new Bills(false, 4556.26, "Ivanov");
        Bills bills2 = new Bills(false, 34556.26, "Petrov");
        Bills bills3 = new Bills(true, -456.26, "Ivanov");
        Bills bills4 = new Bills(false, 546.26, "Sidorov");
        Bills bills5 = new Bills(false, -400.26, "Sidorov");

        AllBankBills allBankBills = new AllBankBills(Arrays.asList(bills1, bills2, bills3, bills4, bills5));
        System.out.println(allBankBills.sortByAccountAmount());
        allBankBills.allAccountAmount(); // key is positive sum and value is negative sum

        System.out.println("All sum account = "+allBankBills.allAccountAmount()[0]);
        System.out.println("positiveSum account = "+allBankBills.allAccountAmount()[1]);
        System.out.println("negativeSum account = "+allBankBills.allAccountAmount()[2]);
    }


}
