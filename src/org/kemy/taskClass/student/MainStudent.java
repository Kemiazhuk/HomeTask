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
        for (Student s : students) {
            int[] arrRating = s.getRating();
            boolean flag = true;
            for (int i = 0; i < arrRating.length; i++) {
                if ((arrRating[i] != 9 ) && (arrRating[i] != 10)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Student " + s.getName()+ " Group " + s.getGroup());
            }

        }
    }
}
