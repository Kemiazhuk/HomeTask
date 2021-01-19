package org.kemy.basicsOfOop.secondTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Payment {
    private ArrayList<Product> products;

    public static class Product {
        private String name;
        private BigDecimal cost;

        public Product(String name, BigDecimal cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return name + " " + cost + "$";
        }
    }

    public Payment(ArrayList<Product> products) {
        this.products = products;
    }

    public Payment() {
    }

    public BigDecimal totalCostProducts() {
        BigDecimal price = new BigDecimal(0);
        for (Product pr : products) {
            price = price.add(pr.cost);
        }
        return price;
    }

    public void removeProduct(int num) {
        this.products.remove(num);
    }

    public void getAllProducts() {
        System.out.println(this.products.toString());
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
