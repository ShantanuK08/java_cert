
package com.mis_test_eight;


class LivingThing {
    
    // Method to be inherited and possibly overridden by subclasses.
    // public: can be accessed anywhere
    public void animalMethod() {
        // Prints a simple message when this method is called.
        System.out.println("A living thing.");
    }
}

// Subclass (child) Animal extends LivingThing
// This means Animal inherits the properties/methods of LivingThing
class Animal extends LivingThing {
    
    // Overrides the animalMethod() from LivingThing
    @Override
    public void animalMethod() {
        // Prints its own message first
        System.out.print("An animal. ");
        
        // Calls the parent class (LivingThing) version of animalMethod
        super.animalMethod();  // 'super' refers to the parent class
    }
}

// Subclass Bird extends Animal
// So it inherits from Animal → which already inherits from LivingThing
class Bird extends Animal {

    // Overrides the animalMethod() from Animal
    @Override
    public void animalMethod() {
        // Prints its own message first
        System.out.print("A Bird. ");
        
        // Calls the immediate superclass's version i.e., Animal.animalMethod()
        super.animalMethod();  // super here refers to Animal
    }
}

// This is the main class which contains the main() method.
// It will execute when the program is run.
public class Test_32 {

    // main() method is the entry point of any Java program.
    public static void main(String[] args) {
        
        // Creating an object 'b' of type Bird
        Bird b = new Bird();  // Data type: Bird (custom class, object type)

        // Calling the overridden method animalMethod() of Bird
        b.animalMethod();

        // Execution flow:
        // Bird.animalMethod() →
        //   prints "A Bird. "
        //   then calls super.animalMethod() → Animal.animalMethod()
        //       prints "An animal. "
        //       then calls super.animalMethod() → LivingThing.animalMethod()
        //           prints "A living thing."
    }
}
