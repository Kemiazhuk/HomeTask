package org.kemy.aggregationAndComposition.bills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static int counterId = 1;
    private int id = 1;
    private String name;
    private List<Bill> billsClient = new ArrayList<>();


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Bill> getBillsClient() {
        return billsClient;
    }

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void createBill(double amount) {
        billsClient.add(new Bill(Bill.counterNumber++, false, amount, name));
    }

    @Override
    public String toString() {
        return billsClient.toString();
    }

    public List<Bill> sortByAccountAmount() {
        Collections.sort(billsClient, Comparator.comparing(Bill::getAccountAmount));
        return billsClient;
    }

    public void unlockBill(int id) {
        for (Bill b : billsClient) {
            if (b.getAccountNumber() == id) {
                b.setBlock(false);
                System.out.println(b);
                break;
            }
        }

    }

    public void lockBill(int id) {
        for (Bill b : billsClient) {
            if (b.getAccountNumber() == id) {
                b.setBlock(true);
                System.out.println(b);
                break;
            }
        }
    }

    public double amountAllBills() {
        double sum = 0;
        for (Bill b : billsClient) {
            sum += b.getAccountAmount();
        }
        return sum;
    }

    public double amountPositiveBills() {
        double sum = 0;
        for (Bill b : billsClient) {
            if (b.getAccountAmount() > 0) {
                sum += b.getAccountAmount();
            }
        }
        return sum;
    }

    public double amountNegativeBills() {
        double sum = 0;
        for (Bill b : billsClient) {
            if (b.getAccountAmount() < 0) {
                sum += b.getAccountAmount();
            }
        }
        return sum;
    }

    public void topUpBill(int id, double amount) {
        for (Bill b : billsClient) {
            if (b.getAccountNumber() == id) {
                b.setAccountAmount(b.getAccountAmount() + amount);
                System.out.println(b.toString());
            }
        }
    }
}
