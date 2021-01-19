package org.kemy.basicsOfOop.thirdTask;

import java.util.HashMap;

public enum DaysOfTheWeek {
    MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5), SUNDAY(6);
    int number;
    private static final HashMap<Integer, DaysOfTheWeek> lookupDay = new HashMap<>();
    static
    {
        for(DaysOfTheWeek d : DaysOfTheWeek.values())
        {
            lookupDay.put(d.getNumber(), d);
        }
    }

    public int getNumber() {
        return number;
    }

    DaysOfTheWeek(int number) {
        this.number = number;
    }

    public static DaysOfTheWeek getNameDay(Integer num){
        return lookupDay.get(num);
    }
}
