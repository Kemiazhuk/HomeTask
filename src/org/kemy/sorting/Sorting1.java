package org.kemy.sorting;

import org.kemy.Input;

import java.util.ArrayList;


public class Sorting1 {
    public void addArray() {
        System.out.println("Enter length first array");
        int firstLen = Input.inputInt();
        System.out.println("Enter length second array");
        int secondLen = Input.inputInt();
        System.out.println("Enter K ");
        int k = Input.inputInt();
        int firstAr[] = new int[firstLen];
        int secondAr[] = new int[secondLen];
        for (int i = 0; i < firstLen; i++) {
            System.out.print("Enter nubers first array = ");
            firstAr[i] = Input.inputInt();
        }
        for (int i = 0; i < secondLen; i++) {
            System.out.print("Enter nubers second array = ");
            secondAr[i] = Input.inputInt();
        }
        if (secondLen+k<=firstLen){
            System.arraycopy(firstAr,k,firstAr,k+secondLen,firstLen-k-secondLen);
            System.arraycopy(secondAr,0,firstAr,k,secondLen);
        }else if (secondLen+k>firstLen){
            System.arraycopy(secondAr,0,firstAr,k,firstLen-k);
        }
        for (int i = 0; i < firstLen; i++) {
            System.out.println(firstAr[i] + "  ");
        }

    }
}
