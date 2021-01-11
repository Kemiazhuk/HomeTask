package org.kemy.basicsOfOop.thirdTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(new ArrayList<>());
        calendar.checkTheDayAndAdd(DaysOfTheWeek.MONDAY, "some regular day");
        calendar.checkTheDayAndAdd(DaysOfTheWeek.FRIDAY, "last working day");
        calendar.checkTheDayAndAdd(DaysOfTheWeek.SUNDAY, "good day for relax");
        calendar.checkTheDayAndAdd(DaysOfTheWeek.SATURDAY, "first rest day");
        for (Calendar.WeekendsAndHolidays c: calendar.getAllDaysWithNotes()){
            System.out.println(c.toString());
        }
    }
}
