package com.methods;
import java.util.*;

public class Vowels {
    void display(String st) {
        int x, y;
        char chr;
        x = st.length();
        System.out.println("The vowels are:");
        for (y = 0; y < x; y++) 
        {
            chr = st.charAt(y); 
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' ||
                chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') 
            {
                System.out.println(chr);
            }
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str;
        Vowels ob = new Vowels();

        System.out.println("Enter your word:");
        str = in.next();  // You can use in.nextLine() if you want full sentence
        ob.display(str);
    }
}
