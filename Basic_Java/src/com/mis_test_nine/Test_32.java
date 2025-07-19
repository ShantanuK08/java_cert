package com.mis_test_nine;

import java.io.*;

// Abstract superclass
abstract class CarbonStructure {
    protected long count;

    public abstract Number getCount() throws IOException;

    public CarbonStructure(int count) {
        this.count = count;
    }
}

// Subclass
class Diamond extends CarbonStructure {
    public Diamond() {
        super(15);
    }

    @Override
    public Long getCount() throws FileNotFoundException {
        return count;
    }
}

// Main public class
public class Test_32 {
    public static void main(String[] args) {
        try {
            final CarbonStructure ring = new Diamond();
            System.out.print(ring.getCount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
