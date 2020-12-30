package org.kemy.taskClass.airline;


import org.kemy.Input;

import java.util.ArrayList;
import java.util.Arrays;

import static org.kemy.taskClass.airline.DaysOfTheWeek.*;
import static org.kemy.taskClass.airline.DaysOfTheWeek.MONDAY;


public class MainAirLine {
    public static void main(String[] args) {
        ArrayList<AirLine> airLines = new ArrayList<>();
        airLines.add(new AirLine("Minsk", "C2", "AirBus", 1054, Arrays.asList(MONDAY, TUESDAY)));
        airLines.add(new AirLine("Kiev", "D22", "Boeing 747", 744, Arrays.asList(WEDNESDAY, THURSDAY)));
        airLines.add(new AirLine("Hrodno", "B21", "Boeing 700", 671, Arrays.asList(MONDAY, SUNDAY)));
        airLines.add(new AirLine("Lviv", "U12", "Boeing 747", 660, Arrays.asList(FRIDAY)));
        airLines.add(new AirLine("Vilnius", "V12", "AirBus", 946, Arrays.asList(SATURDAY, SUNDAY)));
        airLines.add(new AirLine("Riga", "L33", "AirBus", 1111, Arrays.asList(MONDAY)));


        MethodsAirLine newAirLine = new MethodsAirLine(airLines);

        System.out.println("Enter city");
        String city = Input.inputStr();
        newAirLine.searchByCity(city);

        System.out.println("Enter day");
        String day = Input.inputStr();
        newAirLine.searchByDay(valueOf(day));

        System.out.println("Enter day and time format HH:MM");
        String day1 = Input.inputStr();
        String time = Input.inputStr();
        newAirLine.searchByDayTime(day1, time);
    }


}
