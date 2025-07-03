//package com.mis_test_five;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//abstract class Super {
//    public abstract void m1() throws IOException;
//}
//
//class Sub extends Super {
//    @Override
//    public void m1() throws IOException {
//        throw new FileNotFoundException(); // valid subclass exception
//    }
//}
//
//public class Test_27 {
//    public static void main(String[] args) {
//        Super s = new Sub();
//        try {
//            s.m1();
//        } catch (FileNotFoundException e) {
//            System.out.print("M"); // use straight quotes
//        } finally {
//            System.out.print("N");
//        }
//    }
//}
