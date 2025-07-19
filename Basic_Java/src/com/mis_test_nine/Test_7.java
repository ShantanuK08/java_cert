package com.mis_test_nine;

interface MakesNoise {}

abstract class Instrument implements MakesNoise {
    public Instrument(int beats) {}
    public void play() {
        System.out.println("Instrument is playing");
    }
}

public class Test_7 extends Instrument {
    public Test_7() {
        super(4); // Provide required constructor argument
    }

    public void play(int count) {
        System.out.println("Drum is playing " + count + " times");
    }

    public void concert() {
        super.play(); // Now valid
    }

    public static void main(String[] beats) {
        MakesNoise mn = new Test_7();
        ((Test_7) mn).concert(); // Cast needed to access concert()
    }
}
