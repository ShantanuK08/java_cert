package com.mis_test_nine;

 class Grandparent {
    public void foo(int x) {
        System.out.println("Grandparent Foo " + x);
    }
}

 class Parent extends Grandparent {
    public void foo(int x, int y) {
        System.out.println("Parent Foo " + x + " " + y);
    }
}

public class Test_46 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.foo(1);
    }
}
