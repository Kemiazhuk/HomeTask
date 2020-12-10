package org.kemy.aggregationAndComposition.auto;

import java.util.Arrays;

public class Wheels {
    private String [] wheelsName = new String[4];
    private int wheelsRage;

    public Wheels(String[] wheelsName, int wheelsRage) {
        this.wheelsName = wheelsName;
        this.wheelsRage = wheelsRage;
    }


    public void changeWheel(int number, String name) {
        takeOffWheel(number);
        wheelsName[number-1] = name;
        System.out.println("put on a new wheel");
        System.out.println("Now we have " + Arrays.toString(wheelsName));

    }

    public void takeOffWheel(int number){
        System.out.println("Take of " + number + " wheel");
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
