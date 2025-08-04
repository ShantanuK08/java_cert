package com.rev;

// Parent class
class Animalll {
    void eatt() {
        System.out.println("This animal eats food");  // Method defined in parent class
    }	
}

// Child class that inherits from Animal
class Doggg extends Animalll {
    void barkk() {
        System.out.println("The dog barks");  // Method defined in child class
    }
}

// Main class to run the code
public class Leaning_Inheritance {
    public static void main(String[] args) {

        Doggg myDog = new Doggg();  // Create an object of Dog (inherits from Animal)

        myDog.eatt();   // Calls inherited method from Animal
        myDog.barkk();  // Calls method from Dog
    }
}
