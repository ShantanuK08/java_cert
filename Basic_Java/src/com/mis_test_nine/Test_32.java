
package com.mis_test_nine;

import java.io.*;

// Abstract superclass named CarbonStructure
// Abstract classes cannot be instantiated and may contain abstract methods
abstract class CarbonStructure {

    // Protected field 'count' of type long
    // 'protected' allows access from subclasses
    protected long count;

    // Abstract method declaration
    // Must be implemented by any non-abstract subclass
    // Return type is Number (superclass for numeric types like Integer, Long, Double)
    // Method declares it might throw IOException
    public abstract Number getCount() throws IOException;

    // Constructor with int parameter to initialize the 'count' field
    public CarbonStructure(int count) {
        this.count = count; // Assigning the input value to the class field
    }
}

class Diamond extends CarbonStructure {

    // Default constructor – calls the parent constructor with a specific value (15)
    public Diamond() {
        super(15); // Sets count = 15 in the superclass
    }

    // Overriding the abstract method from CarbonStructure
    // Return type is Long, which is a subclass of Number – covariant return type allowed
    // Declares a more specific exception: FileNotFoundException (subclass of IOException)
    @Override
    public Long getCount() throws FileNotFoundException {
        return count; // Return the inherited 'count' field (value = 15)
    }
}

public class Test_32 {

    public static void main(String[] args) {
        try {
            // Create a final reference 'ring' of type CarbonStructure pointing to a Diamond object
            // Demonstrates polymorphism: base class reference refers to subclass object
            final CarbonStructure ring = new Diamond();

            // Call the getCount() method on the object
            // At runtime, the overridden method in Diamond will be executed
            System.out.print(ring.getCount()); // Output will be: 15

        } catch (IOException e) {
            // Catch any IOException or its subclass (like FileNotFoundException)
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
}
