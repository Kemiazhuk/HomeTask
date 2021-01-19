package org.kemy.basicsOfOop.thirdTask;

public class Day {
    private MonthOfTheYear month;
    private DaysOfTheWeek daysOfTheWeek;
    private int numberInMonth;
    private boolean holiday;
    private String inf;

    public Day(Integer month, Integer daysOfTheWeek, int numberInMonth, boolean holiday) {
        this.month = MonthOfTheYear.getNameMonth(month);
        this.daysOfTheWeek = DaysOfTheWeek.getNameDay(daysOfTheWeek);
        this.numberInMonth = numberInMonth;
        this.holiday = holiday;

    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }

    public MonthOfTheYear getMonth() {
        return month;
    }

    public DaysOfTheWeek getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public int getNumberInMonth() {
        return numberInMonth;
    }

    public boolean isHoliday() {
        return holiday;
    }

    @Override
    public String toString() {
        return daysOfTheWeek + " " + numberInMonth +
                " " + month ;
    }
}
