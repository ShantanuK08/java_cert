//To perform different taks using overloading

package com.methods;

public class Choice {
    
    void num_cal(int num, char ch) {
        if (ch == 's')
            System.out.println("The square of the number = " + (num * num));
        else
            System.out.println("The cube of the number = " + (num * num * num));
    }

    void num_cal(int a, int b, char ch) {
        if (ch == 'p')
            System.out.println("The product of the numbers = " + (a * b));
        else
            System.out.println("The sum of the numbers = " + (a + b));
    }


    void num_cal(String str1, String str2) {
        if (str1.equals(str2))
            System.out.println("Two strings are equal");
        else
            System.out.println("Two strings are not equal");
    }


    public static void main(String[] args) {
        Choice obj = new Choice();

        obj.num_cal(5, 's');                
        obj.num_cal(3, 'c');               
        obj.num_cal(4, 6, 'p');             
        obj.num_cal(10, 15, 'a');           
        obj.num_cal("hello", "hello");      
        obj.num_cal("hello", "world");     
    }
}
