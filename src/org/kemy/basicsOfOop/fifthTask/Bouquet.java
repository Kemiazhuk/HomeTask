package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Product> allProducts;
    private ArrayList<Integer> allQuantityProducts;
    private BigDecimal priceBouquet;

    public Bouquet(ArrayList<Product> allProducts, ArrayList<Integer> allQuantityProducts, BigDecimal priceBouquet) {
        this.allProducts = allProducts;
        this.priceBouquet = priceBouquet;
        this.allQuantityProducts = allQuantityProducts;
    }

    public void addPlant(Product plant, int quantity) {
        this.allProducts.add(plant);
        this.allQuantityProducts.add(quantity);
        priceBouquet = priceBouquet.add(plant.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }


    public void addAccessories(Product accessory, int quantity) {
        this.allProducts.add(accessory);
        this.allQuantityProducts.add(quantity);
        priceBouquet = priceBouquet.add(accessory.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }

    public BigDecimal getPriceBouquet() {
        return priceBouquet;
    }

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    public ArrayList<Integer> getAllQuantityProducts() {
        return allQuantityProducts;
    }

    @Override
    public String toString() {
        return allProducts + " " + allQuantityProducts +
                " priceBouquet= " + priceBouquet;
    }
}
