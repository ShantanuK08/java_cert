package com.Object_class;

public class Encode {
    String s, str;

    void input(String st) {
        s = st;
        str = "";
    }

    void perform(int move) {
        int l = s.length();
        int t;
        char c;

        for (int i = 0; i < l; i++) {
            c = s.charAt(i);

            
            if (Character.isUpperCase(c)) {
                t = (int) c;
                t = t + move;

                if (t > 90)
                    t = t - 26;
                if (t < 65)
                    t = t + 26;

                c = (char) t;
            }

            str = str + c;
        }
    }

    void display() {
        System.out.println("Encoded string is: " + str);
    }

    public static void main(String[] args) {
        Encode obj = new Encode();
        obj.input("HELLO WORLD");
        obj.perform(3); 
        obj.display();
    }
}
