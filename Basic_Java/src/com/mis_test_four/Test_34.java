package com.mis_test_four;
//Q.No. – Demonstrates Field Hiding, Upcasting, and Downcasting



//Superclass
class BreathIn {
 String msg = "INHALE"; // Line n1: String field in superclass
}

//Subclass that hides superclass field with a new one of different type
class BreathOut extends BreathIn {
 Object msg = "EXHALE"; // Line n2: Field hiding (Object type)
}

public class Test_34 {
 public static void main(String[] args) {
     // Object of superclass type with superclass reference
     BreathIn obj1 = new BreathIn();  // Line n3: has access to BreathIn.msg ("INHALE")

     // Upcasting: subclass object referred using superclass reference
     BreathIn obj2 = new BreathOut(); // Line n4: field access still refers to BreathIn.msg

     // Downcasting: converting reference back to subclass to access subclass fields
     BreathOut obj3 = (BreathOut) obj2; // Line n5: legal downcast since actual object is BreathOut

     // Field access is resolved at compile-time using reference type:
     // obj1.msg → BreathIn.msg → "INHALE"
     // obj2.msg → BreathIn.msg (field hiding; reference is of type BreathIn)
     // obj3.msg → BreathOut.msg → "EXHALE"
     String text = obj1.msg + "-" + obj2.msg + "-" + obj3.msg; // Line n6

     System.out.println(text); // Line n7 → Output: INHALE-INHALE-EXHALE
 }
}
