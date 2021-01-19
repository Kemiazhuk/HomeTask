package org.kemy.basicsOfOop.thirdTask;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Calendar {
    private ArrayList<WeekendsAndHolidays> allDaysWithNotes;
    private GregorianCalendar calendar;
    private ArrayList<Day> allYear;


    public Calendar(int year) {
        this.calendar = new GregorianCalendar(year, java.util.Calendar.JANUARY, 1);
        calendar.isLeapYear(year);
        this.allDaysWithNotes = new ArrayList<WeekendsAndHolidays>();
        createAllDaysInYear(year);
    }

    public void createAllDaysInYear(int year) {
        allYear = new ArrayList<>();
        while (calendar.get(java.util.Calendar.YEAR) == year) {
            allYear.add(new Day(calendar.get(java.util.Calendar.MONTH),
                    calendar.get(java.util.Calendar.DAY_OF_WEEK),
                    calendar.get(java.util.Calendar.DAY_OF_MONTH), false));
            calendar.add(calendar.DAY_OF_MONTH, 1);
        }
        System.out.println(allYear.size());
    }


    public class WeekendsAndHolidays {
        HashMap<Day, String> allHolidays;

        public WeekendsAndHolidays() {
        }

    }

    public void checkTheDayAndAdd (String inf) {
        //check the day on holidays
        for (Day d : allYear) {
            if ((DaysOfTheWeek.SUNDAY.equals(d.getDaysOfTheWeek())) || ((DaysOfTheWeek.SATURDAY).equals(d.getDaysOfTheWeek()))) {
                d.setInf(inf);
            }
        }
    }

    public ArrayList<WeekendsAndHolidays> getAllDaysWithNotes() {
        return allDaysWithNotes;
    }

}
