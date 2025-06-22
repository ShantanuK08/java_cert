package com.basicprograms;
import java.util.*;
public class Char_type {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		char chr;
		System.out.println("Enter a character");
		chr=in.next().charAt(0);
		if(Character.isLetter(chr)==true)
		{
			if(Character.isUpperCase(chr)==true)
				System.out.println(chr +"is an uppercase character");
			if(Character.isLowerCase(chr)==true)
				System.out.println(chr+"is a lowercase character");
		}
		else
		{
			if(Character.isDigit(chr)==true)
				System.out.println(chr +"is a digit");
			else
				System.out.println (chr +"is a special character");
		}
		
}

}
