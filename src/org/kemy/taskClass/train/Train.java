package org.kemy.taskClass.train;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {
    private String city;
    private int numTrain;
    private Date date;

    public Train(String city, int numTrain, String dateStr) throws ParseException {
        this.city = city;
        this.numTrain = numTrain;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.date = simpleDateFormat.parse(dateStr);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumTrain() {
        return numTrain;
    }

    public void setNumTrain(int numTrain) {
        this.numTrain = numTrain;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
