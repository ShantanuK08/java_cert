package com.constructors;

import java.util.*;

public class Cabservice {
    String taxino, name;
    int d, amt;

   
    Cabservice() {
        taxino = "";
        name = "";
        d = 0;
        amt = 0;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter taxi number:");
        taxino = in.nextLine();
        System.out.println("Enter customer name:");
        name = in.nextLine();
        System.out.println("Enter distance travelled (in km):");
        d = in.nextInt();
    }

   
    void calculate() {
        if (d <= 1)
            amt = 25;
        else if (d <= 5)
            amt = d * 30;
        else if (d <= 10)
            amt = d * 35;
        else
            amt = d * 40;
    }

    
    void display() {
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Taxi Number: " + taxino);
        System.out.println("Customer Name: " + name);
        System.out.println("Distance Travelled: " + d + " km");
        System.out.println("Total Amount: Rs. " + amt);
    }

    
    public static void main(String[] args) {
        Cabservice obj = new Cabservice();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
