package com.mis_test_five;

interface Document{
	default String getType() {
	return "TEXT";
	}
	
}



interface WordDocument extends Document{
	String getType();
}

class Word implements WordDocument{
	public String getType() {
        return "WORD DOC";
    }
}


public class Test_03 {
	public static void main(String []args) {
		Document doc = new Word();
		System.out.println(doc.getType());
	}

}
