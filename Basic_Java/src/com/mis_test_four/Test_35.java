package com.mis_test_four;

//Q.No. – Demonstrates Static Method Hiding and Null-Safe Static Calls


//Superclass renamed from Base → StaticBase
class StaticBase {
 static void print() { // Line n1: static method in superclass
     System.out.println("BASE");
 }
}

//Subclass renamed from Derived → StaticDerived
class StaticDerived extends StaticBase {
 static void print() { // Line n2: static method in subclass (hides superclass method)
     System.out.println("DERIVED");
 }
}

public class Test_35 { 
 public static void main(String[] args) {
     StaticBase b = null; // Reference is null — but it's okay for static methods

     StaticDerived d = (StaticDerived) b; // Line n3: Legal cast (no runtime error because it's not used as an object)

     d.print(); // Line n4: Static method is called via class reference — no NullPointerException
     // This will print: DERIVED
 }
}
