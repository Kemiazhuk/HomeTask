package org.kemy.taskClass.train;

import org.kemy.Input;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTrain {

    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList<>();
        System.out.println("enter number train");
        int number = Input.inputInt();
        try {
            trains.add(new Train("Hrodno", 23, "2020-11-30 12:09:02"));
            trains.add(new Train("Hrodno", 21, "2020-11-30 16:09:02"));
            trains.add(new Train("Brest", 77, "2020-11-30 14:09:02"));
            trains.add(new Train("Kiev", 15, "2020-11-30 20:09:02"));
            trains.add(new Train("Vilnius", 1, "2020-11-30 21:09:02"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sortByNumTrain(trains);
        for (Train t : trains) {
            System.out.println("Number train " + t.getNumTrain() + " City " + t.getCity() + " Date " + t.getDate());
        }
        for (Train t : trains) {
            if (t.getNumTrain() == number) {
                System.out.println("Number train " + t.getNumTrain() + " City " + t.getCity() + " Date " + t.getDate());
                break;
            }
        }
    }

    public static void sortByNumTrain(ArrayList<Train> newArr) {
        Collections.sort(newArr, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getCity().compareTo(o2.getCity()) > 0) {
                    return 1;
                } else if (o1.getCity().compareTo(o2.getCity()) < 0) {
                    return -1;
                } else  {
                    if (o1.getDate().compareTo(o2.getDate()) > 0) {
                        return 1;
                    }else {
                        return -1;
                    }
                }

            }
        });
    }


}
