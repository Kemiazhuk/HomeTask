package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Product> allProducts;
    private BigDecimal priceBouquet;


    public Bouquet(ArrayList<Product> allProducts, BigDecimal priceBouquet) {
        this.allProducts = allProducts;
        this.priceBouquet = priceBouquet;
    }

    public void addPlant(Plant plant, int quantity) {
        plant.setQuantity(quantity);
        this.allProducts.add(plant);
        priceBouquet = priceBouquet.add(plant.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }


    public void addAccessories(Accessories accessory, int quantity) {
        accessory.setQuantity(quantity);
        this.allProducts.add(accessory);
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
