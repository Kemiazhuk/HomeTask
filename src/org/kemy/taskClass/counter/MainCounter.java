package org.kemy.taskClass.counter;


public class MainCounter {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter(1, 100, 2);
        for (int i = 0; i < 100; i++) {
            try {
                counter.increase();
            } catch (Exception IndexOutOfBoundsException) {
//                e.printStackTrace();
                break;
            }
        }
        System.out.println(counter.getNumber());
        for (int i = 0; i < 100; i++) {
            try {
                counter.decrease();
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println(counter.getNumber());

    }
}
