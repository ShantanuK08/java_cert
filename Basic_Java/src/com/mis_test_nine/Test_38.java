
package com.mis_test_nine;


// Interfaces only allow public or default methods; protected is not allowed here
interface Friend {
    // Method declaration inside interface — must be public (by default it is public and abstract)
    public String getName();  //  Return type: String. This method must be implemented by any class that implements this interface.
}

// Define a class Cat which implements Friend interface
class Cat implements Friend {
    // Implementing getName() method — must be public to match the interface contract
    public String getName() { //  Return type: String
        return "Kitty";  // Returns the name of the cat
    }
}

// Define another class Dog which also implements Friend
class Dog implements Friend {
    // This also overrides getName(), and it's legal to throw unchecked exceptions like RuntimeException
    public String getName() throws RuntimeException { //  RuntimeException is optional here
        return "Doggy";  // Returns the name of the dog
    }
}

// Main class for execution
public class Test_38 {
    // Main method - entry point of the program
    public static void main(String[] adoption) {
        // Create an object of type Dog, but reference it using interface type Friend
        Friend friend = new Dog();  // 'friend' is of type Friend, actual object is Dog


        // h5 — This will compile fine but throw ClassCastException at runtime,
        // because 'friend' is actually a Dog, not a Cat
        // System.out.print(((Cat)friend).getName());  //  ClassCastException

        // h6 — This will also compile, but at runtime, it throws NullPointerException
        // because you're calling a method on a null reference
        // System.out.print(((Dog)null).getName());  //  NullPointerException

        // Safe usage — polymorphic call, resolved at runtime to Dog's getName()
        System.out.println(friend.getName());  //  Output: Doggy
    }
}
