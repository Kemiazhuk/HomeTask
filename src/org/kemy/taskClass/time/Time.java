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

    public void setMinute(int minute) throws Exception {
        if ((minute > 60) || (minute < 0)) {
            this.minute = 0;
            throw new Exception("MinuteOutOfRange");
        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws Exception {
        if ((second > 60) || (second < 0)) {
            this.second = 0;
            throw new Exception("SecondOutOfRange");
        } else {
            this.second = second;
        }
    }
}
