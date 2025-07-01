package com.mis_test_four;

//Q.No.30 - Demonstrates Field Hiding vs Method Overriding


//Base class
class Currency {
 String notation = "-"; // Line n1: field in superclass

 String getNotation() { // Line n2: method in superclass
     return notation;
 }
}

//Subclass 1
class USDollar extends Currency {
 String notation = "$"; // Line n3: field hides parent field

 @Override
 String getNotation() { // Line n4: method overrides parent method
     return notation;
 }
}

//Subclass 2
class Euro extends Currency {
 protected String notation = "€"; // Line n5: field hides parent field

 @Override
 protected String getNotation() { // Line n6: method overrides parent method
     return notation;
 }
}

public class Test_31 {
 public static void main(String[] args) {
     Currency c1 = new USDollar();

     // Field access is based on reference type → Currency
     // Method call is based on object type (runtime) → USDollar
     System.out.println(c1.notation + ":" + c1.getNotation());
     // Output: -:$

     Currency c2 = new Euro();

     // Again, field is from Currency, method is from Euro
     System.out.println(c2.notation + ":" + c2.getNotation());
     // Output: -:€
 }
}
