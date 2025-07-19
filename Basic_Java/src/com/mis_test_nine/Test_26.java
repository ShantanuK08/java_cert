package com.mis_test_nine;

public class Test_26 {
    public static void main(String[] args) {
        final String cell = "a";
        String foo = new String("a");
        final String bell = new String(foo);
        System.out.print((cell == bell) + " " + cell.equals(bell));
    }
}
