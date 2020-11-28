package org.kemy.taskClass.time;

import org.kemy.Input;

public class MainTime {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter Hour");
        int hour = Input.inputInt();
        System.out.println("Enter minute");
        int minute = Input.inputInt();
        System.out.println("Enter second");
        int second = Input.inputInt();

        Time newTime = new Time();

        newTime.setHour(hour);
        try {
            newTime.setMinute(minute);
        } catch (Exception e) {
            e.printStackTrace();
            newTime.setMinute(0);
        }
        try {
            newTime.setSecond(second);
        } catch (Exception e) {
            e.printStackTrace();
            newTime.setSecond(0);
        }
        System.out.println(newTime.getHour() + ":"+ newTime.getMinute() + ":" + newTime.getSecond());
    }
}
