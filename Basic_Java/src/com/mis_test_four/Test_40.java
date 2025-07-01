package com.mis_test_four;



//Base class
class Lock {
 public void open() {
     System.out.println("LOCK-OPEN"); // This is the method we want to call
 }
}

//First-level subclass overrides open()
class Padlock extends Lock {
 @Override
 public void open() {
     System.out.println("PADLOCK-OPEN");
 }
}

//Second-level subclass overrides again
class DigitalPadlock extends Padlock {
 @Override
 public void open() {
     // None of the given options can call Lock.open() directly
     // You can only call super.open(), which will resolve to Padlock.open()
     super.open(); // This prints "PADLOCK-OPEN"
     
     // There's NO legal way to call Lock.open() from here unless you add a helper method
 }
}

//Main class
public class Test_40 {
 public static void main(String[] args) {
     Lock lock = new DigitalPadlock();  // Polymorphic reference
     lock.open();  // Expected to print LOCK-OPEN, but it prints PADLOCK-OPEN due to override
 }
}
