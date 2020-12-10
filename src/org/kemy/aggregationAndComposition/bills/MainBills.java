package org.kemy.aggregationAndComposition.bills;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBills {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Client firstClient = new Client(Input.inputStr());

        Bills bills1 = new Bills(1,true, 4556.26, "Ivanov");
        Bills bills2 = new Bills(2,false, 34556.26, "Petrov");
        Bills bills3 = new Bills(3,false, -400.26, "Sidorov");

        AllBankBills allBankBills = new AllBankBills();
        allBankBills.addNewBill(bills1);
        allBankBills.addNewBill(bills2);
        allBankBills.addNewBill(bills3);
        allBankBills.addNewBill(firstClient.createBill(allBankBills.lastBillId()));
        System.out.println("Enter your name");

        for (Bills b : allBankBills.sortByAccountAmount()){
            System.out.println(b.toString());
        }


        System.out.println("Enter your name to locked account");
        String nameClient = Input.inputStr();
        List<Integer> idList = new ArrayList<>(allBankBills.findAllBillsByNameCustomer(nameClient));
        System.out.println("You have bills with Id " + idList.toString());
        System.out.println("What id account you want lock/unlock");
        int idLock = Input.inputInt();
        allBankBills.findToLockUnlock(idLock);

        System.out.println("sort by account amount");
        for (Bills b : allBankBills.sortByAccountAmount()){
            System.out.println(b.toString());
        }
        allBankBills.allAccountAmount(); // key is positive sum and value is negative sum

        System.out.println("All sum accounts = "+allBankBills.allAccountAmount()[0]);
        System.out.println("positiveSum accounts = "+allBankBills.allAccountAmount()[1]);
        System.out.println("negativeSum accounts = "+allBankBills.allAccountAmount()[2]);
    }


}
