package com.Object_class;
import java.util.*;

public class BookFair {
    String Bname;
    double price;
    double dis = 0.0, amt = 0.0;
    Scanner in = new Scanner(System.in);

    void input() {
        System.out.println("Enter the name of the book:");
        Bname = in.nextLine();
        System.out.println("Enter price of the book:");
        price = in.nextDouble();
    }

    void calculate() {
        if (price <= 1000)
            dis = price * 2.0 / 100.0;
        else if (price > 1000 && price <= 3000)
            dis = price * 10.0 / 100.0;
        else
            dis = price * 15.0 / 100.0;

        amt = price - dis;
    }

    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Name of the Book:\t" + Bname);
        System.out.println("Original Price: Rs.\t" + price);
        System.out.println("Discount: Rs.\t\t" + dis);
        System.out.println("Discounted Price: Rs.\t" + amt);
    }

    public static void main(String[] args) {
        BookFair ob = new BookFair();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
