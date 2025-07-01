package com.mis_test_four;

// Base class
class Document {
    int pages;

    // Constructor of base class
    Document(int pages) {
        this.pages = pages;
    }
}

class Word extends Document {
    String type;

    // Constructor that takes only type, and defaults pages to 20
    Word(String type) {
        super(20);         // Call parent constructor with default pages = 20
        this.type = type;  // Set the type
        // THEORY:
        // You can only call one of 'super()' or 'this()' and it must be the first line.
        // Here, 'super(20)' is allowed as it's the first line.
    }

    // Constructor that takes pages and type
    Word(int pages, String type) {
        this(type);            // INSERT-2: delegates to Word(String type)
        super.pages = pages;   // Set the pages manually after constructor call
        // THEORY:
        // We use constructor chaining to reuse Word(String type)
        // Then manually override pages from parent (not best practice, but works)
    }
}

public class Test_18 {
    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");  // Creates a Word object with 25 pages and type TEXT
        System.out.println(obj.type + "," + obj.pages);
        // Output: TEXT,25
    }
}
