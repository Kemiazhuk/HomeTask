package org.kemy.taskClass.counter;

import org.kemy.taskClass.counter.Counter;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter = new Counter(1, 100, 4);
        for (int i = 0; i < 100; i++) {
            try {
                counter.increas();
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println(counter.getNumber());
        for (int i = 0; i < 100; i++) {
            try {
                counter.decreas();
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println(counter.getNumber());

    }
}
