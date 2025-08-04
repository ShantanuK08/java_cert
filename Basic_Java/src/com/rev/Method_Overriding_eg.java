package com.rev;  // Package declaration for organizing classes

// Parent class (superclass)
class AAnimal {
    
    // Method to be overridden by child class
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class (subclass) that extends AAnimal
class Catt extends AAnimal {
    
    // Overriding the 'sound()' method of the parent class
    @Override
    void sound() {
        System.out.println("The cat meows");  // New behavior specific to 'Catt'
    }
}

// Main class with main() method to run the program
public class Method_Overriding_eg {
    
    public static void main(String[] args) {
        
        AAnimal a;         // Reference variable of parent class (AAnimal)
        a = new Catt();    // Object of child class (Catt) assigned to parent reference
        
        a.sound();         // Calls overridden method in Catt — this is runtime polymorphism
                          // Output: "The cat meows" (NOT "Some generic animal sound")
    }
}
