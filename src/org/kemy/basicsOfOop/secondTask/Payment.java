package org.kemy.basicsOfOop.secondTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Payment {

    private ArrayList<Product> products;

    static class Product {
        private String name;
        private BigDecimal cost;

        public Product(String name, BigDecimal cost) {
            this.name = name;
            this.cost = cost;
        }
    }


    public Payment(ArrayList<Product> products) {
        this.products = products;
    }

    public BigDecimal payForProducts() {
        BigDecimal price = new BigDecimal(0);
        for (Product pr : products) {
            price = price.add(pr.cost);
        }
        return price;
    }
}
