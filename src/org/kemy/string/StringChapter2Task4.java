package org.kemy.string;


public class StringChapter2Task4 {
    public void task() {
        StringBuilder str = new StringBuilder("информатика");
        StringBuilder rez = new StringBuilder();
        rez.append(str.charAt(7)).append(str.charAt(3)).append(str.charAt(4)).append(str.charAt(7));
        System.out.println(rez.toString());

    }
}
