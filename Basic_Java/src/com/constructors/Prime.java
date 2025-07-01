package com.constructors;

public class Prime {
    int n;

    Prime() {
        n = 0;
    }

    void input(int x) {
        n = x;
    }

    void display() {
        int i, c = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                c = c + 1;
        }
        if (c == 2)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }

    public static void main(String[] args) {
        Prime obj = new Prime();
        obj.input(17);  
        obj.display();
    }
}
