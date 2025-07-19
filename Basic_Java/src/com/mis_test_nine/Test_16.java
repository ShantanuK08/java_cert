package com.mis_test_nine;

public class Test_16 {

    static class Circle {
        double radius = 10.0;
        double x = 100.0;
        double y = 100.0;

        // Correct area method
        double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area of circle: " + c.getArea());
    }
}
