package org.kemy.taskClass.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute)  {
        if ((minute > 60) || (minute < 0)) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second)  {
        if ((second > 60) || (second < 0)) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public void changeTime(int hourForChange, int minuteForChange, int secondForChange) {
        int changedTime = 0;
        changedTime = (hourForChange + hour) * 3600 + (minuteForChange + minute) * 60 + secondForChange + second;
        hour = changedTime / 3600;
        minute = (changedTime - hour * 3600) / 60;
        second = changedTime - hour * 3600 - minute * 60;
    }
}
