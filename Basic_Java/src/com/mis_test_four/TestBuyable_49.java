package com.mis_test_four;

public class TestBuyable_49 {
    public static void main(String[] args) {
        Buyable_49[] arr = new Buyable_49[2];

        for (Buyable_49 b : arr) {
            System.out.println(b.salePercentage);        // ✅ constant
            System.out.println(Buyable_49.salePercentage()); // ✅ call static via interface
        }

        Book_49[] books = new Book_49[2];

        for (Book_49 b : books) {
            System.out.println(b.salePercentage);         // ✅ constant inherited
            System.out.println(Buyable_49.salePercentage()); // ✅ call via interface name
        }
    }
}
