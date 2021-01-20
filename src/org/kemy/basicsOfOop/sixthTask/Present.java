package org.kemy.basicsOfOop.sixthTask;

import java.math.BigDecimal;
import java.util.HashMap;

public class Present {
    private HashMap<String, Integer> present;
    private BigDecimal presetCost;
    private double allCaloriesPresent;

    public Present(HashMap present, BigDecimal presetCost) {
        this.present = present;
        this.presetCost = presetCost;
    }

    public void addSweet(Sweet sweet, int quantity) {
        present.put(sweet.getName(), quantity);
        presetCost = presetCost.add(sweet.getPrice().multiply(BigDecimal.valueOf(quantity)));
        numberCaloriesInPresent(sweet, quantity);
    }

    public void addAccessories(Accessories accessories, int quantity) {
        present.put(accessories.getName(), quantity);
        presetCost = presetCost.add(accessories.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }

    public void numberCaloriesInPresent(Sweet sweet, int quantity) {
        allCaloriesPresent += sweet.getCalories() * quantity;
    }

    public HashMap<String, Integer> getPresent() {
        return present;
    }

    public BigDecimal getPresetCost() {
        return presetCost;
    }

    @Override
    public String toString() {
        return "Present have " + present + " Cost " + presetCost + " present have " + allCaloriesPresent + " calories";
    }
}
