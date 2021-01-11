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

    public void addPlant(Plant plant, int quantity){
        plant.setQuantity(3);
        this.allProducts.add(plant);
        priceBouquet = priceBouquet.add(plant.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }



    public void addAccessories (Accessories accessory,int quantity){
        this.allProducts.add(accessory);
        accessory.setQuantity(quantity);
        priceBouquet = priceBouquet.add(accessory.getPrice());
    }

    public BigDecimal getPriceBouquet() {
        return priceBouquet;
    }

    @Override
    public String toString() {
        return  allProducts +
                " priceBouquet= " + priceBouquet;
    }
}
