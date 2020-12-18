package org.kemy.taskClass.customer;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainCustomer {
    public static void main(String[] args) {

        System.out.println("Enter first range credit card");
        String firstRange = Input.inputStr();
        System.out.println("Enter second range credit card");
        String secondRange = Input.inputStr();

        AgrCustomer agr = new AgrCustomer();
        agr.createCustomer();
        agr.findCustomersByCreditCard(firstRange, secondRange);
        System.out.println(agr.sortByName().toString());
    }
}
