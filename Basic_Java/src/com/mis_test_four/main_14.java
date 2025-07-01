//q.no. 14

package com.mis_test_four;

// Abstract class with abstract and concrete methods
abstract class Helper {
    int num = 100;
    String operation = null;

    // Must be overridden with same or higher access (protected/public)
    protected abstract void help();

    // Concrete method
    void log() {
        System.out.println("Helper-log");
    }
}

class LogHelper extends Helper {
    private int num = 200;  // Field hiding (not overriding)
    protected String operation = "LOGGING"; // Field hiding

    //  Corrected: Must be 'protected' (same as parent)
    @Override
    protected void help() {
        System.out.println("LogHelper-help");
    }

    // Method overriding (same name/signature)
    @Override
    void log() {
        System.out.println("LogHelper-log");
    }
}

// Java applications must have a main method
public class main_14 {
    public static void main(String[] args) {
        LogHelper obj = new LogHelper();
        obj.help(); // Calls overridden method
        obj.log();  // Calls overridden method
    }
}
