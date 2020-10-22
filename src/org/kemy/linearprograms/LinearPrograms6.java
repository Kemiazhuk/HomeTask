package org.kemy.linearprograms;

import org.kemy.Input;

public class LinearPrograms6 {

    public Boolean calc() {
        Input newInput = new Input();
        System.out.print("X=");
        double x = newInput.inputDouble();
        System.out.print("Y=");
        double y = newInput.inputDouble();
        if ((-2<=x && x<=2)&&(y>=0 && y<=4)||((-4<=x && x<=4)&&(y>=-3 && y<=0))) {
            return true;
        } else{
            return false;
        }
    }
}
