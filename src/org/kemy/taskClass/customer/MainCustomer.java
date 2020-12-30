package org.kemy.taskClass.customer;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;

public class MainCustomer {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ivanov", "Ivan", "Ivanovich", "Hrodno, Lenina street", "1234123412341234", UUID.fromString("6d986af6-efc2-4e9c-afac-18aea3d2b2e6")));
        customers.add(new Customer("Ivanov", "Petr", "Petrovich", "Hrodno, Sovetskaya street", "1234567812345678", UUID.fromString("11111111-efc2-4e9c-afac-18aea3d2b2e6")));
        customers.add(new Customer("Sidorov", "Sid", "Ivanovich", "Minsk, Lenina street", "1232165415941076", UUID.fromString("22222222-efc2-4e9c-afac-18aea3d2b2e6")));
        customers.add(new Customer("Smirnov", "Petr", "Petrovich", "Kiev, Lenina street", "1234555514445093", UUID.fromString("33333333-efc2-4e9c-afac-18aea3d2b2e6")));
        customers.add(new Customer("Starik", "Ivan", "Petrovich", "Minsk, Lenina street", "1234444412341234", UUID.fromString("44444444-efc2-4e9c-afac-18aea3d2b2e6")));
        customers.add(new Customer("Anered", "Slavik", "Petrovich", "Brest, Lenina street", "1234999987643578", UUID.fromString("55555555-efc2-4e9c-afac-18aea3d2b2e6")));

        System.out.println("Enter first range credit card");
        String firstRange = Input.inputStr();
        System.out.println("Enter second range credit card");
        String secondRange = Input.inputStr();

        AgrCustomer agr = new AgrCustomer(customers);

        agr.findCustomersByCreditCard(firstRange, secondRange);
        System.out.println(agr.sortByName().toString());
    }
}
