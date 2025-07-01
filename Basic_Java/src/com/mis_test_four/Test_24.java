//q.no.24

package com.mis_test_four;

// Parent class
class MyClass {  // Fixed typo: class name must be 'MyClass' (capital 'C')
    
    // Constructor
    MyClass() {
        System.out.println(101);
    }

    // THEORY:
    // This is a no-arg constructor. It runs when an object of MyClass or a subclass is created.
}

// Subclass
class MySubClass extends MyClass {
    
    // Constructor (REMOVED 'final' - not allowed for constructors)
    MySubClass() {
        System.out.println(202);
    }

    // THEORY:
    // Constructors cannot be 'final' because they are never inherited.
    // This constructor implicitly calls super() (i.e., MyClass constructor) before executing.
}

public class Test_24 {
    public static void main(String[] args) {
        MySubClass obj = new MySubClass();  // Triggers both constructors
        // First, MyClass() prints 101
        // Then, MySubClass() prints 202

        // If we print the object directly:
        System.out.println(obj);  
        // This will print: com.mis_test_four.MySubClass@<hashcode>

        // THEORY:
        // 'new MySubClass()' will first call MyClass() due to inheritance.
        // Java calls parent constructor before child constructor automatically.
        // Printing the object will show default toString() output unless overridden.
    }
}
