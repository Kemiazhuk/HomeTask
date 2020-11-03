package org.kemy.decomposition;


public class Decomposition1 {

    public static int findNod(int x, int y) {
        int nod=1;
        for (int i = Math.min(x, y); i > 1; i--) {
            if ((x % i == 0) && (y % i == 0)) {
                nod=i;
                break;
            }
        }
        return nod;
    }
    public static int findNok(int x, int y) {
        int nok=0;
        for (int i = 1; i <Math.min(x,y) ; i++) {
            if ((Math.max(x,y) * i)% Math.min(x,y) == 0) {
                nok=Math.max(x,y)*i;
                break;
            }
        }
        return nok;
    }
}
