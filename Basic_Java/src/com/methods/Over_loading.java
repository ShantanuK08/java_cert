

package com.methods;
import java.util.*;

public class Over_loading {

    
    void SumSeries(int n, double x) {
        double sum = 0.0d;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                sum -= x / i;
            else
                sum += x / i;
        }
        System.out.println("Sum of first series: " + sum);
    }

    
    void SumSeries() {
        int sum1 = 0;
        int p = 1;
        for (int i = 1; i <= 20; i++) {
            p *= i;
            sum1 += p;
        }
        System.out.println("Sum of second series: " + sum1);
    }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        System.out.print("Enter the value of x: ");
        double x = in.nextDouble();

        Over_loading ob = new Over_loading();
        ob.SumSeries(n, x);  
        ob.SumSeries();      

        in.close();
    }
}
