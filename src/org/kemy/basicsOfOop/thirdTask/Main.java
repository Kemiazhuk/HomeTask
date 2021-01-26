package org.kemy.basicsOfOop.thirdTask;

import org.kemy.Input;

public class Main {
    public static void main(String[] args) {

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
        System.out.println(calendar.declareDayHoliday(day,month,year).toString());

        System.out.println("What day do you need");
        System.out.println("Enter number of month");
        month = Input.inputInt()-1;
        System.out.println("Enter number day of this month");
        day = Input.inputInt()-1;
        String note = calendar.seeNoteForThisDay(day,month,year);
        if (note == null){
            System.out.println("You  don't have any notes on this day");
            System.out.println("Enter 0 if you want to add note");
            int k = Input.inputInt();
            if (k ==0){
                System.out.println("Enter note");
                calendar.addNotesInDay(day, month, year, Input.inputStr());
            }
        }
        System.out.println("Enter 0 if you want to see all holidays");
        int k = Input.inputInt();
        if (k ==0){
            System.out.println(calendar.findAllSaturdaySunday().toString());
        }


    }
}
