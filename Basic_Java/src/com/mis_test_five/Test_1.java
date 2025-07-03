package com.mis_test_five;

// Interface definition
// An interface in Java is a contract: any class that implements it must provide an implementation of its methods.
interface Ridable {
    void ride(String name); // Interface declares method 'range', not 'ride'
}

//  Base class
class Animal {
    // This class doesn't define any methods.
    // It is used to demonstrate polymorphism and casting.
}

// Horse class: extends Animal and implements Ridable
class Horse extends Animal implements Ridable {

    //  INCORRECT: This method does not match the interface
    // public void ride(String name) { ... }

    //  CORRECT: To properly implement the interface, method name and signature must match exactly
    public void ride(String name) {
        // toUpperCase() will convert input string to uppercase
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}

//  Main class
public class Test_1 {
    public static void main(String[] args) {

        // Polymorphism: Reference is of type Animal, but object is of type Horse
        Animal horse = new Horse();

        //  Direct call like horse.range("Emma"); will not compile because Animal has no such method.

        // Approach:
        // Since Animal does not have method 'range', we need to cast to a type that does.
        // We know the actual object is Horse, so safe to cast to Horse or Ridable.

        ((Horse)horse).ride("Emma");               // Cast to Horse and call range()
        ((Ridable)(Horse)horse).ride("EMMA");      // Double cast (Animal → Horse → Ridable)
        ((Ridable)horse).ride("emma");             // Direct cast to Ridable interface
        ((Horse)(Ridable)horse).ride("emma");      // Cast to Ridable first, then to Horse
    }
}
