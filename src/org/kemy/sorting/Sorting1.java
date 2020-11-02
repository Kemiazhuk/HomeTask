package org.kemy.sorting;

import org.kemy.Input;

import java.util.ArrayList;


public class Sorting1 {
    public void addArray() {
        Input newInput = new Input();
        System.out.println("Enter length first array");
        int firstLen = newInput.inputInt();
        System.out.println("Enter length second array");
        int secondLen = newInput.inputInt();
        System.out.println("Enter K ");
        int k = newInput.inputInt();
        ArrayList<Integer> firstAr =new ArrayList<Integer>();
        ArrayList<Integer> secondAr =new ArrayList<Integer>();
        for (int i = 0; i < firstLen; i++) {
            System.out.print("Enter nubers first array = ");
            firstAr.add(newInput.inputInt());
        }
        for (int i = 0; i < secondLen; i++) {
            System.out.print("Enter nubers second array = ");
            secondAr.add(newInput.inputInt());
        }
        firstAr.addAll(k,secondAr);
        for (int i: firstAr
             ) {
            System.out.print(i+"   ");
        }
    }
}
