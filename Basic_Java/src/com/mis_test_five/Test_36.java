package com.mis_test_five;

//Class containing a method that throws a checked exception
class ReadTheFile {

 // ✅ FIX 1: Declare checked exception in method signature
 // 'IOException' is a checked exception, so we must declare it (or its superclass like Exception)
 static void print() throws Exception {
     throw new IOException(); // throwing a checked exception
 }
}

public class Test_36 {
 public static void main(String[] args) {

     // ✅ FIX 2: Handle the exception using try-catch block
     // Since print() throws Exception, we must catch it
     try {
         ReadTheFile.print(); // method that throws checked exception
     } catch (Exception e) {
         // Catch block handles the exception and prevents compile error
         e.printStackTrace();
     }
 }
}