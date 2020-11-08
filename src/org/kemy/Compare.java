package org.kemy;

public class Compare {
    public static int compare(Double x, Double y) {
        Double EPSILON = 1.0;
        final Double absX = Math.abs(x);
        final Double absY = Math.abs(y);
        EPSILON = 1e-30 * Math.min(absX, absY);  //https://stackoverflow.com/questions/43288079/how-to-determine-if-two-doubles-are-nearly-equal
        if (Math.abs(absX - absY) < EPSILON) {
            return 0;
        } else if (x.compareTo(y) < 0) {
            return -1;

        } else {
            return 1;
        }
    }
}
