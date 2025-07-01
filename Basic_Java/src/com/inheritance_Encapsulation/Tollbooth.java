package com.inheritance_Encapsulation;

import java.util.Scanner;

class Tollbooth {
    private static int ncars, amount;

    Tollbooth() {
        ncars = 0;
        amount = 0;
    }

    void goodcars() {
        ncars += 1;
        amount += 5;
    }

    void badcars() {
        ncars += 1;
    }

    void display() {
        System.out.println("Number of cars passed: " + ncars);
        System.out.println("Total amount collected: Rs. " + amount);
    }

    public static void main(String[] args) {
        Tollbooth booth = new Tollbooth();
        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("Tollbooth Application");
        System.out.println("1. Paying car");
        System.out.println("2. Non-paying car");
        System.out.println("3. Display totals");
        System.out.println("4. Exit");

        do {
            System.out.print("\nEnter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    booth.goodcars();
                    break;
                case 2:
                    booth.badcars();
                    break;
                case 3:
                    booth.display();
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
