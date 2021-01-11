package org.kemy.basicsOfOop.thirdTask;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<WeekendsAndHolidays> allDaysWithNotes;

    public Calendar(ArrayList<WeekendsAndHolidays> allDaysWithNotes) {
        this.allDaysWithNotes = allDaysWithNotes;
    }

    public Calendar() {
    }

    public class WeekendsAndHolidays {
        Enum whatDay;
        String information;

        public WeekendsAndHolidays(Enum whatDay, String information) {
            this.whatDay = whatDay;
            this.information = information;
        }

        @Override
        public String toString() {
            return whatDay +" "+ information;
        }
    }

    public void checkTheDayAndAdd(DaysOfTheWeek day, String inf) {
        //check the day on holidays
        if ((DaysOfTheWeek.SUNDAY.equals(day)) || ((DaysOfTheWeek.SATURDAY).equals(day))) {
            allDaysWithNotes.add(new WeekendsAndHolidays(day, inf));
        }
    }

    public ArrayList<WeekendsAndHolidays> getAllDaysWithNotes() {
        return allDaysWithNotes;
    }

}
