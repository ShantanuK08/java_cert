package com.mis_test_four;

//Class with non-static main() method
class FirstLevel {
 public void main(String[] args) {
     System.out.println("M"); // This line will produce the output
 }
}

//Class with static method that calls FirstLevel's non-static main()
class SecondLevel {
 public static void trigger() {
     new FirstLevel().main(new String[]{}); // Safely calling non-static method
 }
}

//Main class — the only public class (as required in Java)
public class Test_37 {
 public static void main(String[] args) {
     SecondLevel.trigger(); // Starts the execution chain
 }
}