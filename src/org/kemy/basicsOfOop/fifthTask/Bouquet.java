package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {
//    private ArrayList<Plant> plants;
//    private ArrayList<Accessories> accessories;
    private ArrayList<Product> allProducts;
    private BigDecimal priceBouquet;

//    public Bouquet(ArrayList<Plant> plants, ArrayList<Accessories> accessories, BigDecimal priceBouquet) {
//        this.plants = plants;
//        this.accessories = accessories;
//        this.priceBouquet = priceBouquet;
//    }

//    public Bouquet() {
//    }

    public Bouquet(ArrayList<Product> allProducts, BigDecimal priceBouquet) {
        this.allProducts = allProducts;
        this.priceBouquet = priceBouquet;
    }

    public void addPlant(Plant plant, int quantity){
        plant.setQuantity(quantity);
        this.allProducts.add(plant);
        priceBouquet = priceBouquet.add(plant.getPrice());
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
