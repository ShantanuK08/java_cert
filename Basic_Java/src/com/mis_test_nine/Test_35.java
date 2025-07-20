package com.mis_test_nine; 


public class Test_35 { 
    

    private static final String story = "Once upon a time";
    // 'story' is a static constant String.
    // - 'private' means it is accessible only within this class.
    // - 'static' means it belongs to the class (not individual instances).
    // - 'final' means the value cannot be changed once assigned.
    // - 'String' is a data type used to store text.

    String novel = "Default Novel";
    // 'novel' is an instance variable (not static), so each object of Test_35 has its own copy.
    // - Default access modifier (package-private): accessible within the same package.
    // - Not final, so the value can be changed.
    // - Data type is String.

    final static String poem = " ";
    // 'poem' is a static constant.
    // - 'final' means its value cannot be changed.
    // - 'static' means it belongs to the class.
    // - Even though it's just a space, it can be used to represent empty/placeholder content.

    final protected int qty = 10;
    // 'qty' is an instance-level variable.
    // - 'final' means the value is fixed once assigned (10).
    // - 'protected' means accessible in the same package and in subclasses.
    // - 'int' is a primitive data type for integers.
    
    public static void main(String[] args) {
        // The main method is the entry point of the program.
        // 'String[] args' is used to receive command-line arguments (not used here).

        Test_35 book = new Test_35(); 
        
        // Required to access non-static variables like 'novel' and 'qty'.

        System.out.println("Story: " + story);
        // Accesses the static variable 'story' directly without an object.
        // Outputs: Story: Once upon a time

        System.out.println("Novel: " + book.novel);
        // Accesses the instance variable 'novel' using the object 'book'.
        // Outputs: Novel: Default Novel

        System.out.println("Poem: " + poem);
        // Accesses static variable 'poem' directly.
        // Outputs: Poem:  

        System.out.println("Quantity: " + book.qty);
        // Accesses the instance variable 'qty' through the object 'book'.
        // Outputs: Quantity: 10
    }
}
