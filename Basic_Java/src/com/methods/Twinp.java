//To check twin prime numbers by using function


package com.methods;
import java.util.*;

public class Twinp {

    int prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            return 1; 
        else
            return 0; 
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m, p, x, y;
        Twinp ob = new Twinp();

        System.out.println("Enter your first number:");
        m = in.nextInt();
        System.out.println("Enter your second number:");
        p = in.nextInt();

        x = ob.prime(m);
        y = ob.prime(p);

        if ((x == 1 && y == 1) && (Math.abs(m - p) == 2))
            System.out.println("The numbers " + m + " and " + p + " are twin primes.");
        else
            System.out.println("The numbers " + m + " and " + p + " are not twin primes.");
    }
}
