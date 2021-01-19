package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class Bouquet {
    private HashMap<Product,Integer> allProducts;
    private BigDecimal priceBouquet;


    public Bouquet(HashMap<Product,Integer> allProducts, BigDecimal priceBouquet) {
        this.allProducts = allProducts;
        this.priceBouquet = priceBouquet;
    }

    public void addPlant(Product plant, int quantity) {
        this.allProducts.put(plant,quantity);
        priceBouquet = priceBouquet.add(plant.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }


    public void addAccessories(Product accessory, int quantity) {
        this.allProducts.put(accessory,quantity);
        priceBouquet = priceBouquet.add(accessory.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }

    public BigDecimal getPriceBouquet() {
        return priceBouquet;
    }

    @Override
    public String toString() {
        return allProducts +
                " priceBouquet= " + priceBouquet;
    }
}
