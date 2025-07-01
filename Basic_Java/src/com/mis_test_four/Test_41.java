package com.mis_test_four;

class supeer {
    final int NUM = -1; // Line n1: This field cannot be modified
}

class Sub extends supeer {
    int NUM; // Hides Super.NUM
}

public class Test_41 {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.NUM = 200; // This sets Sub.NUM, not Super.NUM
        System.out.println(obj.NUM); //Prints 200
    }
}
