package org.kemy.basicsOfOop.secondTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Product firstPR = payment.new Product("sneakers", BigDecimal.valueOf(99.99));
        Payment.Product secondPR = payment.new Product("sneakers", BigDecimal.valueOf(44.25));
        Payment.Product ThirdPR = payment.new Product("sneakers", BigDecimal.valueOf(55.75));
        ArrayList<Payment.Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(firstPR);
        listOfProducts.add(secondPR);
        listOfProducts.add(ThirdPR);
        Payment deal = new Payment(listOfProducts);
        System.out.println(deal.payForProducts());

    }

}
