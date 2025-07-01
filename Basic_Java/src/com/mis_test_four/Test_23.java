// q.no.23

package com.mis_test_four;

class Super {
    // This is a method, not a constructor
    void Super() {
        System.out.print("KEEP_");
    }
}

class Base extends Super {
    Base() {
        super(); // This calls the constructor of the superclass (Object in this case, since Super has no constructor)
        Super(); // This calls the method named Super()
        System.out.print("GOING_");
    }
}

public class Test_23 {
    public static void main(String[] args) {
        new Base(); // Create object to trigger the constructor
    }
}
