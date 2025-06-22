package com.methods;
import java.util.*;

public class Boolean_Search {

   
    public boolean search(int m[], int ns) {
        boolean p = false;
        for (int i = 0; i < 10; i++) {
            if (m[i] == ns)
                p = true;
        }
        return p;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] m = new int[10];
        int ns;
        boolean y;

        Boolean_Search ob = new Boolean_Search();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter marks [" + (i + 1) + "]: ");
            m[i] = in.nextInt();
        }


        System.out.print("Enter the number to be searched: ");
        ns = in.nextInt();

       
        y = ob.search(m, ns);

        
        if (y)
            System.out.println("The search is successful");
        else
            System.out.println("The search is unsuccessful");

        in.close();
    }
}
