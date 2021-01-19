package org.kemy.basicsOfOop.secondTask;

import org.kemy.Input;
import org.kemy.basicsOfOop.fifthTask.Product;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Product firstPR = new Payment.Product("sneakers", BigDecimal.valueOf(99.99));
        Payment.Product secondPR = new Payment.Product("jacket", BigDecimal.valueOf(44.25));
        Payment.Product ThirdPR = new Payment.Product("pants", BigDecimal.valueOf(55.75));
        ArrayList<Payment.Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(firstPR);
        listOfProducts.add(secondPR);
        listOfProducts.add(ThirdPR);
        Payment deal = new Payment(listOfProducts);
        System.out.println("Total price = " + deal.totalCostProducts());
        deal.getAllProducts();
        System.out.println("if you want you can remove some products enter his number. if you don't want do this  enter 0 ");
        int num = Input.inputInt();
        if ((num > 0) && (num <= deal.getProducts().size())) {
                deal.removeProduct(num-1);
        }
        System.out.println("Total price = " + deal.totalCostProducts());
        deal.getAllProducts();

    }

}
