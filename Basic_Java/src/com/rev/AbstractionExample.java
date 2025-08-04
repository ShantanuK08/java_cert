package com.rev;

// Abstract class: serves as a blueprint, cannot be directly instantiated
abstract class Aanimall {
    
    // Abstract method: no body, must be implemented in child class
    abstract void sound();
    
    // Concrete method: has a body and can be inherited/used by child classes
    void sleep() {
        System.out.println("This animal sleeps at night");
    }
}

// Subclass caat extends the abstract class Aanimall
// It MUST override the abstract method 'sound()'
class caat extends Aanimall {
    
    @Override
    void sound() {
        System.out.println("The cat will not bark.");  // Implementation specific to 'caat'
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        
        // You can't do: Aanimall a = new Aanimall(); ❌ because it's abstract

        // But you can use an abstract class reference to point to a concrete subclass object
        Aanimall mycaat = new caat();  // Polymorphism in action
        
        // Calls the overridden method in 'caat'
        mycaat.sound();   // Output: The cat will not bark.
        
        // Calls the inherited concrete method from abstract class
        mycaat.sleep();   // Output: This animal sleeps at night
    }
}
