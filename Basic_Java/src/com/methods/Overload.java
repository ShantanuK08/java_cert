//To calculate area of geographical figures by using overloading

package com.methods;

 class Overload {

    public double area(double a, double b, double c) {
        double s, ar;
        s = (a + b + c) / 2;
        ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return ar;
    }


    public double area(int a, int b, int height) {
        double ar;
        ar = 0.5 * height * (a + b);
        return ar;
    }

   
    public double area(double diagonal1, double diagonal2) {
        double ar;
        ar = 0.5 * diagonal1 * diagonal2;
        return ar;
    }

    
    public static void main(String[] args) {
        Overload obj = new Overload();

        System.out.println("Area of triangle = " + obj.area(3.0, 4.0, 5.0));
        System.out.println("Area of trapezium = " + obj.area(4, 6, 5));
        System.out.println("Area of rhombus = " + obj.area(8.0, 10.0));
    }
}
