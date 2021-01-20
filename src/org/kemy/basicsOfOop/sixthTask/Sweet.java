package org.kemy.basicsOfOop.sixthTask;

import java.math.BigDecimal;

public class Sweet extends Product implements Cloneable {

    private double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Sweet(String name, BigDecimal price, double calories) {
        super(name, price);
        this.calories = calories;
    }


}
