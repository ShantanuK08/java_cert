//q.no.20

package com.mis_test_four;





import com.mis_test_four.A;

public class Test_20 {
    public static void main(String[] args) {
        A obj1 = new C();   // obj1 refers to C object
        A obj2 = new B();   // obj2 refers to B object

        C obj3 = (C) obj1;  // Valid downcasting: obj1 is actually a C
        obj3.print();       // Output: "C"

        // C obj4 = (C) obj2;  
        // Invalid cast: obj2 is actually a B, not a C
        // Will compile but throw ClassCastException at runtime

        // THEORY:
        // Java allows downcasting (casting parent class reference to subclass),
        // BUT at runtime, it must match the actual object type.
        // obj2 is of type B. Casting it to C will throw ClassCastException.

        // To demonstrate safe casting:
        if (obj2 instanceof C) {
            C obj4 = (C) obj2;
            obj4.print();
        } else {
            System.out.println("obj2 is not an instance of C");
        }

        // Output:
        // C
        // obj2 is not an instance of C
    }
}



//Concept	Explanation
//Polymorphism	A superclass reference (A) can point to subclass objects (B, C)
//Method Overriding	print() is overridden in B and C. At runtime, the actual object's method is called (dynamic dispatch)
//Downcasting	Allowed but unsafe unless checked using instanceof
//ClassCastException	Occurs when you try to cast an object to a class it’s not an instance of









