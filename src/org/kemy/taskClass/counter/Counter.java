package org.kemy.taskClass.counter;

public class Counter {
    private int min;
    private int max;
    private int number;

    public Counter(int min, int max, int number) {
        this.min = min;
        this.max = max;
        this.number = number;
    }

    public Counter() {
        this.min = 0;
        this.max = 100;
        this.number = 5;
    }

    public int increas() throws Exception {
        if (number + 1 > max) {
            throw new Exception("OutOfMaxRange");
        } else {
            number++;
        }
        return number;
    }

    public int decreas() throws Exception {
        if (number - 1 < min){
            throw new Exception("OutOfMinRange");
        } else {
            number--;
        }
            return number;
    }

    public int getNumber() {
        return number;
    }
}
