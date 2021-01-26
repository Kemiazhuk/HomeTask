package org.kemy.basicsOfOop.thirdTask;

public class Day {
    private MonthOfTheYear month;
    private DaysOfTheWeek daysOfTheWeek;
    private int numberInMonth;
    private boolean typeOfDay;
    private String note;

    public boolean isTypeOfDay() {
        return typeOfDay;
    }

    public void setTypeOfDay(boolean typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public Day(Integer month, Integer daysOfTheWeek, int numberInMonth) {
        this.month = MonthOfTheYear.getNameMonth(month);
        this.daysOfTheWeek = DaysOfTheWeek.getNameDay(daysOfTheWeek);
        this.numberInMonth = numberInMonth;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    @Override
    public String toString() {
        return daysOfTheWeek + " " + numberInMonth +
                " " + month + " Note: " + note;
    }
}
