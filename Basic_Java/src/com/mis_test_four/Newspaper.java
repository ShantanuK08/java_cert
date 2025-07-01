//q.no.16
package com.mis_test_four;

interface Printable {
    public void setMargin();
    public void setOrientation(); // Must be implemented
}

abstract class Paper implements Printable {
    public void setMargin() {
        System.out.println("Margin set");
    }
    // setOrientation() is still unimplemented
}

class Newspaper extends Paper {
    //  Fix: Implement the missing method
    public void setOrientation() {
        System.out.println("Orientation set");
    }

    public static void main(String[] args) {
        Newspaper n = new Newspaper();
        n.setMargin();
        n.setOrientation();
    }
}
