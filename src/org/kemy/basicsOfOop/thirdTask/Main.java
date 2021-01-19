package org.kemy.basicsOfOop.thirdTask;

import org.kemy.Input;

public class Main {
    public static void main(String[] args) {
//        calendar.checkTheDayAndAdd(DaysOfTheWeek.MONDAY, "some regular day");
//        calendar.checkTheDayAndAdd(DaysOfTheWeek.FRIDAY, "last working day");
//        calendar.checkTheDayAndAdd(DaysOfTheWeek.SUNDAY, "good day for relax");
//        calendar.checkTheDayAndAdd(DaysOfTheWeek.SATURDAY, "first rest day");
        System.out.println("Enter what year do you need");
        int year = Input.inputInt();
        Calendar calendar = new Calendar(year);
        String dayForNote = null;
        int month = 0;
        int day = 0;
        System.out.println("Enter what day do you need to add notes MM:DD");
        while (dayForNote == null) {
            try {
                dayForNote = Input.inputStr();
                String s[] = dayForNote.split(":");
                month = Integer.valueOf(s[0])-1;
                day = Integer.valueOf(s[1])-1;
            } catch (ArrayIndexOutOfBoundsException e) {
                dayForNote = null;
                System.out.println("Enter in use the required format");
            }
        }
        System.out.println("Enter notes for this day");
        calendar.addNotesInDay(day, month, year, Input.inputStr());
        System.out.println("What day you want to declare a holiday");
        System.out.println("Enter number of month");
        month = Input.inputInt()-1;
        System.out.println("Enter number day of this month");
        day = Input.inputInt()-1;
        calendar.declareDayHoliday(day,month,year);
        calendar.findAllSaturdaySunday();


    }
}
