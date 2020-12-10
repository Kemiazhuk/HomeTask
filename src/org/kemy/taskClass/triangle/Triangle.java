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

    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public double calculatePerimeter() {

        return distance(firstPoint.getPointX(), firstPoint.getPointY(), secondPoint.getPointX(), secondPoint.getPointY()) +
                distance(firstPoint.getPointX(), firstPoint.getPointY(), thirdPoint.getPointX(), thirdPoint.getPointY()) +
                distance(secondPoint.getPointX(), secondPoint.getPointY(), thirdPoint.getPointX(), thirdPoint.getPointY());
    }

    public double calculateSquare() {
        double halfPer = calculatePerimeter() / 2;
        return Math.sqrt(halfPer * (halfPer - distance(firstPoint.getPointX(), firstPoint.getPointY(), secondPoint.getPointX(), secondPoint.getPointY())) *
                (halfPer - distance(firstPoint.getPointX(), firstPoint.getPointY(), thirdPoint.getPointX(), thirdPoint.getPointY())) *
                (halfPer - distance(secondPoint.getPointX(), secondPoint.getPointY(), thirdPoint.getPointX(), thirdPoint.getPointY())));
    }

    public Point findPointCrossingMedians() {
        Point medianPoint = new Point((firstPoint.getPointX() + secondPoint.getPointX() + thirdPoint.getPointX()) / 3,
                (firstPoint.getPointY() + secondPoint.getPointY() + thirdPoint.getPointY()) / 3);

        return medianPoint;
    }

}
