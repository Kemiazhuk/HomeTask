package org.kemy.basicsOfOop.thirdTask;

import org.kemy.Input;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        calendar.checkTheDayAndAdd(DaysOfTheWeek.MONDAY, "some regular day");
//        calendar.checkTheDayAndAdd(DaysOfTheWeek.FRIDAY, "last working day");
//        calendar.checkTheDayAndAdd(DaysOfTheWeek.SUNDAY, "good day for relax");
//        calendar.checkTheDayAndAdd(DaysOfTheWeek.SATURDAY, "first rest day");
        System.out.println("Enter what year do you need");
        int year = Input.inputInt();
        Calendar calendar = new Calendar(year);

        for (Calendar.WeekendsAndHolidays c: calendar.getAllDaysWithNotes()){
            System.out.println(c.toString());
        }
    }
}
