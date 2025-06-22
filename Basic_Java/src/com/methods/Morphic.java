package com.methods;

import java.util.*;

public class Morphic {
    int digits(int m) {
        int p, c = 0, r;
        double k = 0.0D;
        p = m * m;
        while (m != 0) {
            m = m / 10;
            c = c + 1;
        }
        k = p % (Math.pow(10, c));
        r = (int) k;
        return r;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, b;
        Morphic ob = new Morphic();

        System.out.print("Enter a number: ");  
        n = in.nextInt();
        b = ob.digits(n);

        if (n == b)
            System.out.println(n + " is an Automorphic number");
        else
            System.out.println(n + " is not an Automorphic number");

        in.close();
    }
}
