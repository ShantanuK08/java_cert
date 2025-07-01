package com.constructors;

public class Piglatin {
    int i, p;
    String wd, st1, st2;
    char chr;

    Piglatin() {
        wd = "";
    }

    void input(String word) {
        wd = word.toLowerCase();
    }

    void display() {
        p = wd.length();
        for (i = 0; i < p; i++) {
            chr = wd.charAt(i);
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
                break;
        }

        if (i == p) {
            
            System.out.println("No vowels found in the word. Cannot convert to Piglatin.");
        } else {
            st1 = wd.substring(i, p);
            st2 = wd.substring(0, i);
            System.out.println("The Piglatin form of the word:");
            System.out.println(st1 + st2 + "ay");
        }
    }

    public static void main(String[] args) {
        Piglatin obj = new Piglatin();
        obj.input("School");  
        obj.display();
    }
}
