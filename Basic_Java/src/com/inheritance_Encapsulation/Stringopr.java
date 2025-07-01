package com.inheritance_Encapsulation;

public class Stringopr {
    private String s;

    public Stringopr(String x) {
        s = x;
    }

    int len(String p) {
        return p.length();
    }

    int numberofwords() {
        int c = 0;
        for (int j = 0; j < len(s); j++) {
            if (s.charAt(j) == ' ')
                c++;
        }
        return c + 1;
    }

    void display() {
        System.out.println("Original String: " + s);
        System.out.println("Length of String: " + len(s));
        System.out.println("Number of Words: " + numberofwords());
    }

    public static void main(String[] args) {
        Stringopr obj = new Stringopr("Hello world from Java");
        obj.display();
    }
}
