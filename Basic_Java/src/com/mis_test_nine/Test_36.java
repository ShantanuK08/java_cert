package com.mis_test_nine;

public class Test_36 {
    
    public void foo(int[] x) {
        x[0] = x[0] + 1;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = a;

        Test_36 obj = new Test_36(); 
        obj.foo(a);

        System.out.println(a[0] + " " + b[0]);
    }
}
