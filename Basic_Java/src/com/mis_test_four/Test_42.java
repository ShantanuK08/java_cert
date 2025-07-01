package com.mis_test_four; 
//  This declares the package where this file belongs: com.mis_test_four

// No need to import Chair or Sellable, because they are in the same package

public class Test_42 {
    public static void main(String[] args) {
        //  'Chair' and 'Sellable' are defined in the same package  accessible without import
        Sellable obj = new Chair();  // Polymorphic reference
        System.out.println(obj.symbol() + obj.getPrice()); // Calls overridden methods
    }
}












//In Java, the `import` statement is used when:
//- You want to use a class or interface that is defined in a DIFFERENT package

//If two classes belong to the SAME package:
//- They can access each other directly without any import
//- The compiler automatically searches for classes in the same package

//Example:
//- This class is in package: com.mis_test_four
//- Chair.java and Sellable.java are also in: com.mis_test_four
//So, they are accessible here directly

//Only classes from different packages like com.otherpkg.Foo require:
//import com.otherpkg.Foo;