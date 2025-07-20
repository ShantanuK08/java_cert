
package com.mis_test_nine;

// Interface declaration
interface MakesNoise {
    // Empty interface, used as a marker or for polymorphism.
}

// Abstract class Instrument implements the interface MakesNoise
abstract class Instrument implements MakesNoise {

    // Constructor that takes an int parameter named 'beats'
    // This constructor must be called from subclasses
    public Instrument(int beats) {
        // Constructor logic can be added here if needed.
    }

    // Non-abstract method inside abstract class — provides common functionality
    public void play() {
        // Print message to indicate generic instrument is playing
        System.out.println("Instrument is playing");
    }
}

// Public class Test_7 extends Instrument and provides implementation
public class Test_7 extends Instrument {

    // Constructor of Test_7, must call super() with an int due to parent constructor
    public Test_7() {
        super(4); // Calls Instrument's constructor with 4 beats
    }

    // Overloaded method with int argument — specific to Test_7
    public void play(int count) {
        // Print how many times the drum is playing
        System.out.println("Drum is playing " + count + " times");
    }

    // Method to call the parent class's play method
    public void concert() {
        super.play(); // Calls Instrument's 'play()' method
    }

    // Main method: entry point of program, takes String array named beats
    public static void main(String[] beats) {

        // Creating a reference of interface type MakesNoise and assigning a Test_7 object
        MakesNoise mn = new Test_7();

        // Casting the interface reference to Test_7 to access subclass-specific method
        ((Test_7) mn).concert(); // Calls concert(), which internally calls play()
    }
}
