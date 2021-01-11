package org.kemy.basicsOfOop.thirdTask;

import java.util.ArrayList;

public class ClassCalendar {
    private ArrayList<weekendsAndHolidays> allDaysWithNotes;

    public ClassCalendar(ArrayList<weekendsAndHolidays> allDaysWithNotes) {
        this.allDaysWithNotes = allDaysWithNotes;
    }

    public ClassCalendar() {
    }

    public class weekendsAndHolidays {
        Enum whatDay;
        String information;

        public weekendsAndHolidays(Enum whatDay, String information) {
            this.whatDay = whatDay;
            this.information = information;
        }

        @Override
        public String toString() {
            return whatDay +" "+ information;
        }
    }

    public void checkTheDayAndAdd(Enum day, String inf) {
        //check the day on holidays
        if ((day.compareTo(DaysOfTheWeek.SUNDAY) == 0) || (day.compareTo(DaysOfTheWeek.SATURDAY) == 0)) {
            allDaysWithNotes.add(new weekendsAndHolidays(day, inf));
        }
    }

    public ArrayList<weekendsAndHolidays> getAllDaysWithNotes() {
        return allDaysWithNotes;
    }

}
