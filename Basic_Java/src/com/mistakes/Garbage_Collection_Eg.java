package com.mistakes;

public class Garbage_Collection_Eg {
    static int x;

    public static void main(String[] args) {
        System.out.println(x); 
        
        Test t = new Test();   
        System.out.println(t.j); 
        System.out.println(Test.i); 
    }
}


class Test {
    static int i = 100;
    int j = 200;
}
