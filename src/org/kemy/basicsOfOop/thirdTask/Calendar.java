package org.kemy.basicsOfOop.thirdTask;

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
                    calendar.get(java.util.Calendar.DAY_OF_MONTH)));
            calendar.add(calendar.DAY_OF_MONTH, 1);
        }
    }


    public static class WeekendsAndHolidays {
        HashMap<Day, String> allHolidays;

        public WeekendsAndHolidays() {
            this.allHolidays = new HashMap<>();
        }

        public void addDay(Day day, String str){
            allHolidays.put(day,str);
        }

    }

    public void addNotesInDay(Integer day, Integer month, Integer year, String notes) {
        GregorianCalendar c = new GregorianCalendar(year, month, day);
        allYear.get(c.get(java.util.Calendar.DAY_OF_YEAR)).setNote(notes);
        System.out.println(allYear.get(c.get(java.util.Calendar.DAY_OF_YEAR)).toString());
    }

    public void findAllSaturdaySunday() {
        //check the day on holidays
        WeekendsAndHolidays weekendsAndHolidays = new WeekendsAndHolidays();
        for (Day d : allYear) {
            if ((DaysOfTheWeek.SUNDAY.equals(d.getDaysOfTheWeek())) || ((DaysOfTheWeek.SATURDAY).equals(d.getDaysOfTheWeek()))) {
                weekendsAndHolidays.addDay(d,"Holiday");
                d.setTypeOfDay(true);
            }
        }
    }
    public void declareDayHoliday(Integer day, Integer month, Integer year){
        WeekendsAndHolidays weekendsAndHolidays = new WeekendsAndHolidays();
        GregorianCalendar c = new GregorianCalendar(year, month, day);
        Day day1 = allYear.get(c.get(java.util.Calendar.DAY_OF_YEAR));
        day1.setTypeOfDay(true);
        weekendsAndHolidays.addDay(day1,"Holiday");
        System.out.println(day1.toString()+ " now this day a holiday");
    }

    public ArrayList<WeekendsAndHolidays> getAllDaysWithNotes() {
        return allDaysWithNotes;
    }

}
