package org.kemy.taskClass.counter;

public class Counter {
    private int min;
    private int max;
    private int number;

    public Counter(int min, int max, int number) throws Exception {
        this.min = min;
        this.max = max;
        if ((number > min) && (number < max)) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("OutOfMaxRange");
        }
    }

    public Counter() {
        this.min = 0;
        this.max = 100;
        this.number = 5;
    }

    public int increase() throws Exception {
        if (number + 1 > max) {
            throw new IndexOutOfBoundsException("OutOfMaxRange");
        } else {
            number++;
        }
        return number;
    }

    public int decrease() throws Exception {
        if (number - 1 < min) {
            throw new IndexOutOfBoundsException("OutOfMinRange");
        } else {
            number--;
        }
        return number;
    }

    public int getNumber() {
        return number;
    }
}
