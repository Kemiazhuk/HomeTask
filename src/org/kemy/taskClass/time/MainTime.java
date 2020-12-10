package org.kemy.taskClass.time;

import org.kemy.Input;

public class MainTime {
    public static void main(String[] args) {
        Time newTime = new Time();
        System.out.println("Enter Hour");
        newTime.setHour(Input.inputInt());
        System.out.println("Enter minute");
        newTime.setMinute(Input.inputInt());
        System.out.println("Enter second");
        newTime.setSecond(Input.inputInt());

        System.out.println(newTime.getHour() + ":" + newTime.getMinute() + ":" + newTime.getSecond());

        System.out.println("Enter how many hours to change the time ");
        int changeHour = Input.inputInt();
        System.out.println("Enter how many minutes to change the time");
        int changeMinute = Input.inputInt();
        System.out.println("Enter how many seconds to change the time");
        int changeSecond = Input.inputInt();

        newTime.changeTime(changeHour, changeMinute, changeSecond);

        System.out.println(newTime.getHour() + ":" + newTime.getMinute() + ":" + newTime.getSecond());
    }
}
