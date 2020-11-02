package org.kemy;

public class Compare {
    public static boolean compareEqual(Double x, Double y, Double EPSILON){
        final Double absX = Math.abs(x);
        final Double absY = Math.abs(y);
        final Double diff = Math.abs(x-y);

        if (x == y) {
            return true;
        } else {
            if (x == 0 || y == 0 || diff < Double.MIN_NORMAL) {
                return diff < (EPSILON * Double.MIN_NORMAL);
            } else {
                return diff / (absX + absY) < EPSILON;
            }
        }
    }

    public static int compareMinMaxEqual (Double x, Double y, Double EPSILON){
        if (compareEqual(x,y,EPSILON)){
            return 0;
        }else if (x>y){
            return 1;
        }else  {
            return -1;
        }
    }
}
