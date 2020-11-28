package org.kemy.taskClass.customer;
import org.kemy.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainCustomer {
    public static void main(String[] args) {
        MainCustomer mainCustomer = new MainCustomer();
        ArrayList<Customer> customer = new ArrayList<Customer>();
        customer.add(new Customer(1, "Ivanov", "Ivan", "Ivanovich", "Hrodno, Lenina street", "1234123412341234", 456));
        customer.add(new Customer(2, "Ivanov", "Petr", "Petrovich", "Hrodno, Sovetskaya street", "1234567812345678", 752));
        customer.add(new Customer(3, "Sidorov", "Sid", "Ivanovich", "Minsk, Lenina street", "1232165415941076", 123));
        customer.add(new Customer(4, "Smirnov", "Petr", "Petrovich", "Kiev, Lenina street", "1234555514445093", 344));
        customer.add(new Customer(5, "Starik", "Ivan", "Petrovich", "Minsk, Lenina street", "1234444412341234", 475));
        customer.add(new Customer(6, "Anered", "Slavik", "Petrovich", "Brest, Lenina street", "1234999987643578", 544));

        mainCustomer.sortByName(customer);
        for (Customer c : customer) {
            System.out.println(c.toString());
        }
        System.out.println("Enter first range credit card");
        String firstRange = Input.inputStr();
        System.out.println("Enter second range credit card");
        String secondRange = Input.inputStr();
        mainCustomer.findCustomersByCreditCard(customer, firstRange, secondRange);

    }

    public  void findCustomersByCreditCard(ArrayList<Customer> customer, String firstRange, String secondRange) {
        for (Customer c : customer) {
            if ((c.getCreditCard().compareTo(firstRange) > 0) && (
                    c.getCreditCard().compareTo(secondRange) < 0)) {
                System.out.println(c.toString());
            }
        }
    }

    public  void sortByName(ArrayList<Customer> list) {
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getFullName().compareTo(o2.getFullName()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
