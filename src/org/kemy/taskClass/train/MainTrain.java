package org.kemy.taskClass.train;

import org.kemy.Input;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTrain {

    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList<>();

        try {
            trains.add(new Train("Hrodno", 23, "2020-11-30 12:09:02"));
            trains.add(new Train("Hrodno", 21, "2020-11-30 16:09:02"));
            trains.add(new Train("Brest", 2, "2020-11-30 14:09:02"));
            trains.add(new Train("Kiev", 34, "2020-11-30 20:09:02"));
            trains.add(new Train("Vilnius", 1, "2020-11-30 21:09:02"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sortByNumTrain(trains);
        System.out.println("Sort by Number Train");
        for (Train t : trains) {
            System.out.println("Number train " + t.getNumTrain() + " City " + t.getCity() + " Date " + t.getDate());
        }
        System.out.println("enter number train");

        // metod
        int number = Input.inputInt();
        boolean flag = false;
        for (Train t : trains) {
            if (t.getNumTrain() == number) {
                System.out.print("Your train is - ");
                System.out.println("Number train " + t.getNumTrain() + " City " + t.getCity() + " Date " + t.getDate());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Train with this number does not exist");
        }
        System.out.println();
        System.out.println("Sort trains by city and date");
        sortByCityAndDate(trains);
        for (Train t : trains) {
            System.out.println("Number train " + t.getNumTrain() + " City " + t.getCity() + " Date " + t.getDate());
        }
    }

    private static void sortByNumTrain(ArrayList<Train> newArr) {
        Collections.sort(newArr, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getNumTrain() > o2.getNumTrain()) {
                    return 1;
                } else if (o1.getNumTrain() < o2.getNumTrain()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        });

    }


    private static void sortByCityAndDate(ArrayList<Train> newArr) {
        Collections.sort(newArr, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                int compareCity = o1.getCity().compareTo(o2.getCity());
                int compareDate = o1.getDate().compareTo(o2.getDate());
                if (compareCity != 0) {
                    return compareCity;
                } else {
                    return compareDate;
                }
            }
        });
    }


}
