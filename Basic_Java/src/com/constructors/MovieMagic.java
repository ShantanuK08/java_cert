package com.constructors;
import java.util.*;

public class MovieMagic {
    int year;
    String title;
    float rating;
    Scanner in = new Scanner(System.in);

    MovieMagic() {
        year = 0;
        rating = 0.0F;
    }

    void accept() {
        System.out.println("Enter year:");
        year = in.nextInt();
        in.nextLine(); 

        System.out.println("Enter title:");
        title = in.nextLine(); 

        System.out.println("Enter rating:");
        rating = in.nextFloat();
    }

    void display() {
        if (rating <= 2.0)
            System.out.println(title + "\tFlop");
        else if (rating <= 3.4)
            System.out.println(title + "\tSemi-hit");
        else if (rating <= 4.5)
            System.out.println(title + "\tHit");
        else if (rating <= 5.0)
            System.out.println(title + "\tSuper-Hit");
        else
            System.out.println("Invalid rating");
    }

    public static void main(String args[]) {
        MovieMagic ob = new MovieMagic();
        ob.accept();
        ob.display();
    }
}
