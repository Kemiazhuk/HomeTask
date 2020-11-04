package org.kemy.oneDimensional;

import org.kemy.Compare;
import org.kemy.Input;

public class OneDimensional2 {
    public int change (){
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        System.out.print("Enter Z = ");
        double z = newInput.inputDouble();
        double [] arr = new double[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i]= newInput.inputDouble();
            if (Compare.compare(arr[i],z)==1) {
                arr[i]=z;
                sum++;
            }
        }
        return sum;
    }
}
