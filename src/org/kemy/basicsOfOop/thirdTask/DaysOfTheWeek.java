package org.kemy.basicsOfOop.thirdTask;

import java.util.HashMap;

public enum DaysOfTheWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
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
