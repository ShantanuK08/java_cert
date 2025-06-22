package com.methods;
import java.util.*;

public class Check_Number {
    
    void Number() {
        int ch;
        Scanner in = new Scanner(System.in);
        System.out.println("1. To check a Buzz Number");
        System.out.println("2. To check a Composite Number");
        System.out.print("Enter your choice: ");
        ch = in.nextInt();

        switch (ch) {
            case 1:
                int n;
                System.out.print("Enter a number: ");
                n = in.nextInt();
                if (n % 7 == 0 || n % 10 == 7)
                    System.out.println(n + " is a Buzz number.");
                else
                    System.out.println(n + " is not a Buzz number.");
                break;

            case 2:
                int a, c = 0, i;
                System.out.print("Enter a number: ");
                a = in.nextInt();
                for (i = 2; i < a; i++) {
                    if (a % i == 0)
                        c++;
                }
                if (c > 0)
                    System.out.println(a + " is a Composite number.");
                else
                    System.out.println(a + " is not a Composite number.");
                break;

            default:
                System.out.println("Wrong choice!!");
        }
        in.close();
    }

    public static void main(String[] args) {
        Check_Number obj = new Check_Number();
        obj.Number();
    }
}
