package org.kemy.taskClass;

public class Test1 {
    private int firstNum = 22;
    private int secondNum = 33;

    public void print() {
        System.out.println(firstNum + " " + secondNum + " ");
    }

    public void changeNum() {
        firstNum = firstNum * 44;
        secondNum = secondNum + 10;
    }

    public void sumNum() {
        int rez = firstNum + secondNum;
    }

    public void minMax() {
        int max = Math.max(firstNum, secondNum);
    }
}
