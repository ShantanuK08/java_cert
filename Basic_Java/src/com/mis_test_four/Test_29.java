// Q.No.29 – Demonstrates Inheritance and Method Overriding

package com.mis_test_four;

class X {
    void Art() {
        System.out.print("Art");
    }
}

class Y extends X {  //  Fix: Y now extends X
    @Override
    void Art() {
        System.out.print("Art-");
    }

    void Balling() {
        System.out.print("Balling-");
    }

    void Catch() {
        System.out.print("Catch-");
    }
}

public class Test_29 {
    public static void main(String[] args) {
        X obj = new Y();   // Upcasting: Y object as X reference
        obj.Art();         // Valid (overridden method in Y)

        //  Below two lines won't compile since `obj` is of type X (doesn’t know Balling/Catch)
        // obj.Balling();
        // obj.Catch();

        //  To call Y-specific methods:
        Y objY = (Y) obj;
        objY.Balling();
        objY.Catch();
    }
}

//1. Inheritance: Y extends X → allows upcasting (X obj = new Y();)
//2. Method Overriding: Y provides its own version of Art()
//3. Polymorphism: At runtime, Y's Art() is called via X reference
//4. Type Casting: To access Balling() and Catch(), we must cast X back to Y
