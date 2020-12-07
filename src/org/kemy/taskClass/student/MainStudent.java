package org.kemy.taskClass.student;

import java.util.ArrayList;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ann", 1, new int[]{6, 8, 9, 7, 10}));
        students.add(new Student("Ivan", 1, new int[]{4, 6, 3, 6, 2}));
        students.add(new Student("Helen", 2, new int[]{5, 6, 7, 8, 3}));
        students.add(new Student("Peter", 2, new int[]{9, 9, 9, 9, 9}));
        students.add(new Student("Tim", 3, new int[]{7, 7, 7, 7, 7}));
        students.add(new Student("Sam", 3, new int[]{9,10,9,10,10}));
        students.add(new Student("Helen2", 4, new int[]{5, 6, 7, 8, 3}));
        students.add(new Student("Peter2", 4, new int[]{9, 9, 9, 9, 9}));
        students.add(new Student("Tim2", 4, new int[]{7, 7, 7, 7, 7}));
        students.add(new Student("Sam2", 4, new int[]{9,10,9,10,10}));

        for (Student s : students) {
            s.stundentWithGoodMarks();
        }

    }
}
