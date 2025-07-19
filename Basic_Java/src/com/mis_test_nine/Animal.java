//48

package com.mis_test_nine;
interface Dog {
    default void pet() {
        System.out.print("Friendly");
    }
}

interface Cat {
    default void pet() {
        System.out.print("Tempted");
    }
}

public class Animal implements Dog, Cat {
    public void pet() {
        System.out.print("Favorite");
    }

    public static void main(String[] args) {
        new Animal().pet();
    }
}
