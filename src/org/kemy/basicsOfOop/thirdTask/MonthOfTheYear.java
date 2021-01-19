package org.kemy.basicsOfOop.thirdTask;

import java.util.HashMap;

enum MonthOfTheYear {
        JANUARY(0), FEBRUARY(1), MARCH(2), APRIL(3), MAY(4), JUNE(5), JULE(6), AUGUST(7), SEPTEMBER(8), OCTOBER(9), NOVEMBER(10), DECEMBER(11);

    int number;

    private static final HashMap<Integer, MonthOfTheYear> lookupMonth = new HashMap<>();
    static
    {
        for(MonthOfTheYear m : MonthOfTheYear.values())
        {
            lookupMonth.put(m.getNumber(), m);
        }
    }

    MonthOfTheYear(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static MonthOfTheYear getNameMonth(Integer num){
        return lookupMonth.get(num);
    }
}
