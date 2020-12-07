package org.kemy.taskClass;

import org.kemy.Input;

public class Test1 {

    private int firstNum = 22;
    private int secondNum = 33;


    public void print() {
        System.out.println(firstNum + " " + secondNum + " ");
    }

    public void changeNum(int first, int second) {
        firstNum = first;
        secondNum = second;
    }

    public int sumNum() {
        return  firstNum + secondNum;
    }

    public int max() {
        return Math.max(firstNum, secondNum);
    }
}
