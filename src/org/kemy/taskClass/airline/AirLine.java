package org.kemy.taskClass.airline;


import java.util.ArrayList;
import java.util.List;

public class AirLine {
    private String destinationCity;
    private int flightNumber;
    private String typeAirplane;
    private int time;
    private List<String> days;

    public AirLine(String destinationCity, int flightNumber, String typeAirplane, int time, List<String> days) {
        this.destinationCity = destinationCity;
        this.flightNumber = flightNumber;
        this.typeAirplane = typeAirplane;
        this.time = time;
        this.days = days;
    }

    @Override
    public String toString() {
        return
                "destinationCity='" + destinationCity + '\'' +
                        ", time=" + time / 60 + ":" + (time - (time / 60 * 60)) +
                        ", day='" + days + '\'';
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeAirplane() {
        return typeAirplane;
    }

    public void setTypeAirplane(String typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }
}
