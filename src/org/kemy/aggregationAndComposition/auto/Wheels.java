package org.kemy.aggregationAndComposition.auto;

import java.util.Arrays;

public class Wheels {
    private String [] wheelsName = new String[4];
    private int wheelsRage;

    public Wheels(String[] wheelsName, int wheelsRage) {
        this.wheelsName = wheelsName;
        this.wheelsRage = wheelsRage;
    }

    @Override
    public String toString() {
        return "wheelsName=" + Arrays.toString(wheelsName) +
                ", wheelsRage=" + wheelsRage;
    }

    public String[] getWheelsName() {
        return wheelsName;
    }

    public void setWheelsName(String[] wheelsName) {
        this.wheelsName = wheelsName;
    }

    public int getWheelsRage() {
        return wheelsRage;
    }

    public void setWheelsRage(int wheelsRage) {
        this.wheelsRage = wheelsRage;
    }


}
