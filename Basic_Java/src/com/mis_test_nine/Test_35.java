package com.mis_test_nine;

public class Test_35 {
    private static final String story = "Once upon a time";
    String novel = "Default Novel";
    final static String poem = " ";
    final protected int qty = 10;

    public static void main(String[] args) {
        Test_35 book = new Test_35(); 
        System.out.println("Story: " + story);
        System.out.println("Novel: " + book.novel);
        System.out.println("Poem: " + poem);
        System.out.println("Quantity: " + book.qty);
    }
}
