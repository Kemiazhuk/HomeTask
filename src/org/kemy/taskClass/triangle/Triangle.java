package org.kemy.taskClass.triangle;

public class Triangle {
    Point firstPoint;
    Point secondPoint;
    Point thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) throws Exception {
        if (existenceTriangle(firstPoint, secondPoint, thirdPoint)) {
            this.firstPoint = firstPoint;
            this.secondPoint = secondPoint;
            this.thirdPoint = thirdPoint;
        } else {
            throw new NotTriangleCoordinatesException();
        }
    }

    public double distance(Point first, Point second) {
        return Math.sqrt((first.getPointX() - second.getPointX()) * ((first.getPointX() - second.getPointX())
                + (first.getPointY() - second.getPointY()) * (first.getPointY() - second.getPointY())));
    }


    public boolean existenceTriangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        if ((distance(firstPoint, secondPoint) + distance(firstPoint, thirdPoint) > distance(thirdPoint, secondPoint)) &&
                (distance(firstPoint, secondPoint) + distance(thirdPoint, secondPoint) > distance(firstPoint, thirdPoint)) &&
                (distance(thirdPoint, secondPoint) + distance(firstPoint, thirdPoint)) > (distance(firstPoint, secondPoint))) {
            return true;
        } else {
            return false;
        }
    }

    public double calculatePerimeter() {
        return distance(firstPoint, secondPoint) + distance(firstPoint, thirdPoint) + distance(secondPoint, thirdPoint);
    }

    public double calculateSquare() {
        double halfPer = calculatePerimeter() / 2;
        return Math.sqrt(halfPer * (halfPer - distance(firstPoint, secondPoint)) *
                (halfPer - distance(firstPoint, thirdPoint)) * (halfPer - distance(secondPoint, thirdPoint)));
    }

    public Point findPointCrossingMedians() {
        Point medianPoint = new Point((firstPoint.getPointX() + secondPoint.getPointX() + thirdPoint.getPointX()) / 3,
                (firstPoint.getPointY() + secondPoint.getPointY() + thirdPoint.getPointY()) / 3);

        return medianPoint;
    }

}
