package com.inheritance_Encapsulation;

public class Number {
    private int num;

    public Number(int x) {
        num = x;
    }

    int reverse(int n) {
        int rev = 0, r;
        while (n != 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev;
    }

    void palindrome() {
        int k = reverse(num);
        if (k == num)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }

    public static void main(String[] args) {
        Number obj = new Number(121);
        obj.palindrome();
    }
}
