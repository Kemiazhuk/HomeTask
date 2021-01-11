package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Plant> plants;
    private ArrayList<Accessories> accessories;
    private BigDecimal priceBouquet;

    public Bouquet(ArrayList<Plant> plants, ArrayList<Accessories> accessories, BigDecimal priceBouquet) {
        this.plants = plants;
        this.accessories = accessories;
        this.priceBouquet = priceBouquet;
    }

//    public Bouquet() {
//    }

    public void addPlant(Plant plant){
        this.plants.add(plant);
        priceBouquet = priceBouquet.add(plant.getPrice());
    }

    public void addAccessories (Accessories accessory){
        this.accessories.add(accessory);
        priceBouquet = priceBouquet.add(accessory.getPrice());
    }

    public BigDecimal getPriceBouquet() {
        return priceBouquet;
    }

    @Override
    public String toString() {
        return "Bouquet = " + plants +
                ", accessories=" + accessories +
                ", priceBouquet=" + priceBouquet ;
    }
}
