package org.kemy.basicsOfOop.fourthTask;

import org.kemy.basicsOfOop.sixthTask.Present;

import java.math.BigDecimal;

public class Treasure {
    private String name;
    private MaterialTreasure materialType;
    private BigDecimal cost;

    public Treasure(String name, MaterialTreasure materialType, BigDecimal cost) {
        this.name = name;
        this.materialType = materialType;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name +
                " materialType=" + materialType +
                " cost=" + cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaterialTreasure getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialTreasure materialType) {
        this.materialType = materialType;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
