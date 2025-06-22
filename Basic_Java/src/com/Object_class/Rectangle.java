package com.Object_class;
import java.util.*;

public class Rectangle {
    int m, n, a, p;
    double d;

    public void inputdata() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        m = in.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        n = in.nextInt(); 
    }

    public void calculation() {
        a = m * n;
        p = 2 * (m + n);
        d = Math.sqrt(m * m + n * n);
    }

    public void outputdata() {
        System.out.println("The area of rectangle is " + a);
        System.out.println("The perimeter of rectangle is " + p);
        System.out.println("The diagonal of rectangle is " + d);
    }

    public static void main(String args[]) {
        Rectangle ob = new Rectangle();
        ob.inputdata();
        ob.calculation();
        ob.outputdata();
    }
}
