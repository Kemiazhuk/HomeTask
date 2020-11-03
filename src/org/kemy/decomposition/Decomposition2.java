package org.kemy.decomposition;

import java.util.Arrays;

public class Decomposition2 {
    public static int nodForFour(int a1, int a2, int a3, int a4) {
        int nod = 1;
        int[] arr = new int[4];
        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;
        arr[3] = a4;
        Arrays.sort(arr);

        for (int i = arr[0]; i > 1; i--) {
            if ((arr[0] % i == 0) && (arr[1] % i == 0) && (arr[2] % i == 0) && (arr[3] % i == 0)) {
                nod = i;
                break;
            }
        }

        return nod;
    }
}
