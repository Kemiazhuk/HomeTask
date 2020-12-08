package org.kemy.taskClass.triangle;

import org.kemy.Input;

public class MainTriangle {
    public static void main(String[] args) {

        System.out.println("Enter first point coordinates");
        Point firstPoint = new Point(Input.inputDouble(), Input.inputDouble());
        System.out.println("Enter second point coordinates");
        Point secondPoint = new Point(Input.inputDouble(), Input.inputDouble());
        System.out.println("Enter third point coordinates");
        Point thirdPoint = new Point(Input.inputDouble(), Input.inputDouble());

        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        System.out.println("Perimeter = " + triangle.calcPerimeter() + "  Square = " + triangle.calcSquare() +
                " coordinates point medeian X = " + triangle.pointMedians().getPointX() +
                " coordinates point medeian Y = " + triangle.pointMedians().getPointY());

    }
}
