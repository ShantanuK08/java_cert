//To check the answer with Teacher's answer

package com.arrays;
import java.util.*;

class Triangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double s, s1, s2, s3, area;
        int c = 0, i;
        double ans[] = new double[40];

        // Input triangle sides
        System.out.println("Enter the sides of the triangle:");
        s1 = in.nextDouble();
        s2 = in.nextDouble();
        s3 = in.nextDouble();

        // Check if triangle is valid
        if ((s1 + s2 > s3) && (s2 + s3 > s1) && (s1 + s3 > s2)) {
            // Calculate area using Heron's formula
            s = (s1 + s2 + s3) / 2.0;
            area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

            // Input 40 students' answers
            System.out.println("Enter the area answers by 40 students:");
            for (i = 0; i < 40; i++)
                ans[i] = in.nextDouble();

            // Compare each answer with actual area
            for (i = 0; i < 40; i++)
                if (Math.abs(ans[i] - area) < 0.001) // Allow small margin for float comparison
                    c++;

            System.out.println("Number of students who gave correct answer: " + c);
        } else {
            System.out.println("Triangle formation is not possible");
        }
    }
}
