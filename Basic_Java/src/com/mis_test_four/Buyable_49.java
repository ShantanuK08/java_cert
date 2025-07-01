package com.mis_test_four;

// ✅ Interface with a constant and static method
public interface Buyable_49 {
    int salePercentage = 85; // public static final

    // ✅ Static method — not inherited by implementing classes
    static String salePercentage() {
        return salePercentage + "%";
    }
}
