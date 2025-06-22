// to check whether a word is Palindroe or not

package com.stringhandling;

public class palindrome {
	public static void main(String word)
	{
		String word1="";
		int i,p;
		char chr;
		p=word.length();
		for(i=p-1;i>0;i--)
		{
			chr=word.charAt(i);
			word1=word1+chr;
		}
		if(word.equals(word1))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
