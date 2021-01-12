package org.kemy.basicsOfOop.sixthTask;

import java.math.BigDecimal;
import java.util.HashMap;

public class Present {
    private HashMap<Product,Integer> present;
    private BigDecimal presetCost;

    public Present(HashMap present) {
        this.present = present;
    }

    public void addSweet (Sweet sweet,int quantity){
        present.put(sweet,quantity);
        presetCost = presetCost.add(sweet.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }

    public void addAccessories(Accessories accessories, int quantity){
        present.put(accessories,quantity);
        presetCost = presetCost.add(accessories.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }

    public HashMap<Product, Integer> getPresent() {
        return present;
    }

    public BigDecimal getPresetCost() {
        return presetCost;
    }
}
