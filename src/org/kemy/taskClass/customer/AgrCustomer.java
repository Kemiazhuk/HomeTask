package org.kemy.taskClass.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AgrCustomer {
    private ArrayList<Customer> customer;

    public AgrCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public AgrCustomer() {
    }

    public void createCustomer(Customer newCustomer) {
        customer.add(newCustomer);
    }

    public void findCustomersByCreditCard(String firstRange, String secondRange) {
        for (Customer c : customer) {
            if ((c.getCreditCard().compareTo(firstRange) > 0) && (
                    c.getCreditCard().compareTo(secondRange) < 0)) {
                System.out.println(c.toString());
            }
        }
    }

    public ArrayList<Customer> sortByName() {
        ArrayList<Customer> sortCustomer = (ArrayList<Customer>) customer.clone();
        Collections.sort(sortCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        return sortCustomer;
    }
}
