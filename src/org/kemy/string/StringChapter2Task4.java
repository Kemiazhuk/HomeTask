package org.kemy.string;


public class StringChapter2Task4 {
    public void task() {
        StringBuilder str = new StringBuilder("информатика");
        str.setCharAt(2,'т');
        str.setCharAt(5,'т');
        str.delete(0,2);
        str.delete(4,9);
        System.out.print(str);



    }
}
