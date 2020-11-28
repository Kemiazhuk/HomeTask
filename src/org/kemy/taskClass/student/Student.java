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

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getRating() {
        return rating;
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }
}