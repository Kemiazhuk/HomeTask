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
            firstAr[i]=Input.inputInt();
        }
        for (int i = 0; i < secondLen; i++) {
            System.out.print("Enter nubers second array = ");
            secondAr[i]= Input.inputInt();
        }
        int j=0;
        int t= firstLen - k -secondLen;
        for (int i = firstLen-t; i<firstLen; i++){
            firstAr[i]=firstAr[k+j];
            j++;
        }
        j=0;
        int r=k;
        while ((j< secondLen)&&(r<firstLen)){
            firstAr[r]=secondAr[j];
            j++;
            r++;
        }
        for(int i=0; i<firstLen;i++) {
            System.out.println(firstAr[i]+ "  ");
        }
//        for (int i = k+1; i<firstLen; i++){
//            j++;
//            if (j<=secondLen-1) {
//                int t = secondAr[j];
//                secondAr[j] = firstAr[i];
//                firstAr[i] = t;
//            } else {
//
//            }
//        }
    }
}
