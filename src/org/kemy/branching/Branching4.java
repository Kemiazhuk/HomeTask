package org.kemy.branching;

import org.kemy.Compare;
import org.kemy.Input;

import java.lang.reflect.Array;

public class Branching4 {

    public double[] sorting(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
        return array;
    }

    public boolean calc() {

        double[] side = new double[3];
        Input newInput = new Input();
        System.out.print("Length hole A =");
        double a = newInput.inputDouble();
        System.out.print("Length hole B =");
        double b = newInput.inputDouble();
        System.out.print("Brick X = ");
        side[0] = newInput.inputDouble();
        System.out.print("Brick Y = ");
        side[1] = newInput.inputDouble();
        System.out.print("Brick Z = ");
        side[2] = newInput.inputDouble();
        side=sorting(side);
        double firstMinSide=side[0];
        double secondMinSide=side[1];
        double k = Math.min(a, b);
        b = Math.max(a, b);
        a = k;

        if (((Compare.compare(secondMinSide , a)<=0)
                && (Compare.compare(firstMinSide ,b)<=0)) ||
                ((secondMinSide > a) &&
                        (Compare.compare(b , ((2 * secondMinSide * firstMinSide * a +
                                (secondMinSide * secondMinSide - firstMinSide * firstMinSide) *
                                Math.sqrt(secondMinSide * secondMinSide + firstMinSide * firstMinSide - a * a)) /
                                (secondMinSide * secondMinSide + firstMinSide * firstMinSide)))>=0))){
            return true;
        } else {
            return false;
        }
    }
}
