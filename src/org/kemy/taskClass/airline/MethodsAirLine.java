package org.kemy.taskClass.airline;

import java.util.ArrayList;
import java.util.Arrays;

import org.kemy.taskClass.airline.DaysOfTheWeek;

import static org.kemy.taskClass.airline.DaysOfTheWeek.*;

public class MethodsAirLine {
    private ArrayList<AirLine> airLines;

    public MethodsAirLine(ArrayList<AirLine> airLines) {
        this.airLines = airLines;
    }


    public void searchByCity(String city) {
        for (AirLine a : airLines) {
            if (a.getDestinationCity().compareTo(city) == 0) {
                System.out.println(a.toString());
            }
        }
    }

    public void searchByDay(Enum day) {
        for (AirLine a : airLines) {
            for (Enum e : a.getDays()) {
                if (e == day) {
                    System.out.println(a.toString());
                }
            }

        }
    }

    public void searchByDayTime(String day, String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3, 5));
        for (AirLine a : airLines) {
            if (a.getTime() > hour * 60 + min) {
                for (Enum e : a.getDays()) {
                    if (e.toString().compareTo(day) == 0) {
                        System.out.println(a.toString());
                    }
                }
            }
        }
    }
}
