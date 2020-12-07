package org.kemy.taskClass.airline;


import org.kemy.Input;


public class MainAirLine {
    public static void main(String[] args) {


        CreateAirLine newAirLine = new CreateAirLine();
        newAirLine.createNewAirLine();
        System.out.println("Enter city");
        String city = Input.inputStr();
        newAirLine.searchByCity(city);

        System.out.println("Enter day");
        String day = Input.inputStr();
        newAirLine.searchByDay(day);

        System.out.println("Enter day and time format HH:MM");
        String day1 = Input.inputStr();
        String time = Input.inputStr();
        newAirLine.searchByDayTime(day1, time);
    }


}
