package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional3 {
    public void calc () {
        System.out.print("Enter length array  ");
        int n = Input.inputInt();
        double [] arr = new double[n];
        int pos=0;
        int neg=0;
        int zero=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter araay numbers = ");
            arr[i]= Input.inputDouble();
            if (arr[i]<0) {
                neg++;
            }else if (arr[i]>0) {
                pos++;
            }else zero++;
        }
        System.out.println("Negative = "+neg+" Zero = "+zero+ " Positive = "+pos);
    }
}
