// Q.No.28 – Demonstrates Method Overriding and Multi-Level Inheritance

package com.mis_test_four;

public class Test_28 {
    public static void main(String[] args) {
        Alpha a = new Gamma(); // Upcasting: Gamma object referenced by Alpha
        System.out.println(a.compute("Go")); // Polymorphism: Gamma's compute() will be invoked
    }
}

// Base class Alpha defines the compute logic
class Alpha {
    // Repeats string 3 times
    String compute(String str) {
        return str + str + str;
    }
}

// Beta extends Alpha and overrides compute
class Beta extends Alpha {
    // Converts input to lowercase, then calls super.compute
    @Override
    String compute(String str) {
        return super.compute(str.toLowerCase());
    }
}

// Gamma extends Beta and overrides compute
class Gamma extends Beta {
    // Replaces 'o' with 'O', then calls super.compute
    @Override
    String compute(String str) {
        return super.compute(str.replace('o', 'O'));
    }
}
