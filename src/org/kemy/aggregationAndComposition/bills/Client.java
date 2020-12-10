package org.kemy.aggregationAndComposition.bills;

import org.kemy.Input;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public Bills createBill(int id) {
        System.out.println("Enter account amount");
        Bills bill = new Bills(id + 1, false, Input.inputDouble(), name);
        return bill;

    }


}
