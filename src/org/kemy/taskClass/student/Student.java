package org.kemy.taskClass.student;

import java.util.ArrayList;

public class Student {
    private String name;
    private int group;
    private int[] rating = new int[5];


    public Student(String name, int group, int[] rating) {
        this.name = name;
        this.group = group;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int[] getRating() {
        return rating;
    }

    public void stundentWithGoodMarks() {
        boolean flag = true;
        for (int i = 0; i < rating.length; i++) {
            if ((rating[i] != 9) && (rating[i] != 10)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Student " + name + " Group " + group);
        }
    }
}