package org.kemy.taskClass.triangle;

public class Triangle {
    Point firstPoint;
    Point secondPoint;
    Point thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public double distace(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public double calcPerimeter() {

        return distace(firstPoint.getPointX(), firstPoint.getPointY(), secondPoint.getPointX(), secondPoint.getPointY()) +
                distace(firstPoint.getPointX(), firstPoint.getPointY(), thirdPoint.getPointX(),thirdPoint.getPointY()) +
                distace(secondPoint.getPointX(), secondPoint.getPointY(), thirdPoint.getPointX(),thirdPoint.getPointY());
    }

    public double calcSquare() {
        double halfPer = calcPerimeter() / 2;
        return Math.sqrt(halfPer * (halfPer - distace(firstPoint.getPointX(), firstPoint.getPointY(), secondPoint.getPointX(), secondPoint.getPointY())) *
                (halfPer - distace(firstPoint.getPointX(), firstPoint.getPointY(), thirdPoint.getPointX(),thirdPoint.getPointY())) *
                (halfPer - distace(secondPoint.getPointX(), secondPoint.getPointY(), thirdPoint.getPointX(),thirdPoint.getPointY())));
    }

    public Point pointMedians() {
        Point medianPoint = new Point ((firstPoint.getPointX() + secondPoint.getPointX() + thirdPoint.getPointX()) / 3,
                                                        (firstPoint.getPointY() + secondPoint.getPointY() + thirdPoint.getPointY()) / 3);

        return medianPoint;
    }

}
