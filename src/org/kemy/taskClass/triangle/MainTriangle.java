package org.kemy.taskClass.triangle;

import org.kemy.Input;
import org.kemy.taskClass.customer.NotTriangleCoordinatesException;

public class MainTriangle {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter first point coordinates");
        Point firstPoint = new Point(Input.inputDouble(), Input.inputDouble());
        System.out.println("Enter second point coordinates");
        Point secondPoint = new Point(Input.inputDouble(), Input.inputDouble());
        System.out.println("Enter third point coordinates");
        Point thirdPoint = new Point(Input.inputDouble(), Input.inputDouble());
        Triangle triangle;
        try {
            triangle = new Triangle(firstPoint, secondPoint, thirdPoint);
        } catch (NotTriangleCoordinatesException ex) {
            System.out.println("triangle with this coordinates does not exist");
        }

        System.out.println("Perimeter = " + triangle.calculatePerimeter() + "  Square = " + triangle.calculateSquare() +
                " coordinates point medeian X = " + triangle.findPointCrossingMedians().getPointX() +
                " coordinates point medeian Y = " + triangle.findPointCrossingMedians().getPointY());
    }
}
