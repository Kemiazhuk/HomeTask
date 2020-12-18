package org.kemy.taskClass.airline;

import java.util.ArrayList;
import java.util.Arrays;

import org.kemy.taskClass.airline.DaysOfTheWeek;

import static org.kemy.taskClass.airline.DaysOfTheWeek.*;

public class CreateAirLine {
    private ArrayList<AirLine> airLines;

    public void createNewAirLine() {
        airLines = new ArrayList<>();
        airLines.add(new AirLine("Minsk", 32, "AirBus", 1054, Arrays.asList(MONDAY, TUESDAY)));
        airLines.add(new AirLine("Kiev", 123, "Boeing 747", 744, Arrays.asList(WEDNESDAY, THURSDAY)));
        airLines.add(new AirLine("Hrodno", 32, "Boeing 700", 671, Arrays.asList(MONDAY, SUNDAY)));
        airLines.add(new AirLine("Lviv", 32, "Boeing 747", 660, Arrays.asList(FRIDAY)));
        airLines.add(new AirLine("Vilnius", 32, "AirBus", 946, Arrays.asList(SATURDAY, SUNDAY)));
        airLines.add(new AirLine("Riga", 32, "AirBus", 1111, Arrays.asList(MONDAY)));
    }

    public void searchByCity(String city) {
        for (AirLine a : airLines) {
            if (a.getDestinationCity().compareTo(city) == 0) {
                System.out.println(a.toString());
            }
        }
    }

    public void searchByDay(String day) {
        for (AirLine a : airLines) {
            for (Enum e : a.getDays()) {
                if (e.toString().compareTo(day) == 0) {
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
