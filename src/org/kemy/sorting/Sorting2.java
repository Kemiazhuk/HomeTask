package org.kemy.sorting;

import java.util.ArrayList;

public class Sorting2 {
    public void sortBySelect() {
        ArrayList<Integer> sortedArr = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            sortedArr.add((int) (Math.random() * 26));
        }
//        for (int i = 0; i < 6; i++) {
//            for (int j = i+1; j < 7; j++) {
//                if (sortedArr.get(i) > sortedArr.get(j)) {
                    Integer k = sortedArr.get(0);
                    sortedArr.set(sortedArr.get(1),0) ;
                    sortedArr.set(k,1);
//                }
//            }
//        }
        for (int i : sortedArr
        ) {
            System.out.println(i + "   ");
        }

    }
}
