package org.kemy.taskClass.triangle;

import org.kemy.Input;

public class MainTriangle {
    public static void main(String[] args) {
        System.out.println("Enter first point coordinates");
        double firstX = Input.inputDouble();
        double firstY = Input.inputDouble();
        System.out.println("Enter second point coordinates");
        double secondX = Input.inputDouble();
        double secondY = Input.inputDouble();
        System.out.println("Enter third point coordinates");
        double thirdX = Input.inputDouble();
        double thirdY = Input.inputDouble();

        Triangle triangle = new Triangle(firstX, firstY, secondX, secondY, thirdX, thirdY);
        System.out.println("Perimeter = "+triangle.calcPerimeter()+ "  Square = " + triangle.calcSquare() + " coordinates point medeian = " + triangle.pointMedians());

    }
}
