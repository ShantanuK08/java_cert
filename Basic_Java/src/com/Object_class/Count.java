//A class program need not be written to perform the above tasks

package com.Object_class;

public class Count {
    String s;
    int t1, t2;

    void input(String st) {
        s = st;
        t1 = 0;
        t2 = 0;
    }

    void countwords() {
        
        String[] words = s.trim().split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                if (Character.isUpperCase(firstChar))
                    t1++;
                else if (Character.isLowerCase(firstChar))
                    t2++;
            }
        }
    }

    void display() {
        System.out.println("Input String: " + s);
        System.out.println("Number of words starting with uppercase letters: " + t1);
        System.out.println("Number of words starting with lowercase letters: " + t2);
    }

    public static void main(String[] args) {
        Count obj = new Count();
        obj.input("Hello world This is a Test of Java code");
        obj.countwords();
        obj.display();
    }
}
