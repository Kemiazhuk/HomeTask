package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional9 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i] = newInput.inputInt();
        }
        int count=0;
        int minCount=0;
        int indexNum=0;

        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count>minCount){
                minCount=count;
                indexNum=i;
            } else if((count==minCount)&&(arr[i]<arr[indexNum])){
                indexNum=i;
            }
        }
        System.out.println("number is " + arr[indexNum]);
    }
}