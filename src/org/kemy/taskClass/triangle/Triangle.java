package org.kemy.taskClass.triangle;

import javafx.util.Pair;

public class Triangle {
    private double pointX1;
    private double pointY1;
    private double pointX2;
    private double pointY2;
    private double pointX3;
    private double pointY3;

    public double getPointX1() {
        return pointX1;
    }

    public double getPointY1() {
        return pointY1;
    }

    public double getPointX2() {
        return pointX2;
    }

    public double getPointY2() {
        return pointY2;
    }

    public double getPointX3() {
        return pointX3;
    }

    public double getPointY3() {
        return pointY3;
    }

    public Triangle(double pointX1, double pointY1, double pointX2, double pointY2, double pointX3, double pointY3) {
        this.pointX1 = pointX1;
        this.pointY1 = pointY1;
        this.pointX2 = pointX2;
        this.pointY2 = pointY2;
        this.pointX3 = pointX3;
        this.pointY3 = pointY3;
    }

    public double distace(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public double calcPerimeter() {

        return distace(getPointX1(), getPointY1(), getPointX2(), getPointY2()) +
                distace(getPointX1(), getPointY1(), getPointX3(), getPointY3()) +
                distace(getPointX2(), getPointY2(), getPointX3(), getPointY3());
    }

    public double calcSquare() {
        double halfPer = calcPerimeter() / 2;
        return Math.sqrt(halfPer * (halfPer - distace(getPointX1(), getPointY1(), getPointX2(), getPointY2())) *
                (halfPer - distace(getPointX1(), getPointY1(), getPointX3(), getPointY3())) *
                (halfPer - distace(getPointX2(), getPointY2(), getPointX3(), getPointY3())));
    }

    public Pair pointMedians() {
        Pair<Double,Double> newPair = new Pair<>((getPointX1() + getPointX2() + getPointX3()) / 3, (getPointY1() + getPointY2() + getPointY3()) / 3);

        return newPair;
    }

}
