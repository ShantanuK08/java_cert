package com.mis_test_four;

public interface Sellable {
    double getPrice();

    default String symbol() {
        return "$";
    }
}