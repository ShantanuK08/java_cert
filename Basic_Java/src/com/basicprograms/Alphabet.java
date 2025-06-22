package com.basicprograms;
import java.util.*;
public class Alphabet {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		char chr,chr1;
		System.out.println("Enter a character ");
		chr =in.next().charAt(0);
		if(Character.isUpperCase(chr)==true)
		{
			chr1=Character.toLowerCase(chr);
			System.out.println("The lowercase of "+ chr+"is" + chr);
			System.out.println("The ASCII value of"+chr1 +"is" + (int)chr1);
		}
		else
		{
			chr1 =Character.toUpperCase(chr);
			System.out.println("The uppercase of"+ chr +"is" +chr1);
			System.out.println("the ASCII value of "+chr1+"is" + (int)chr1);
		}
	}

}
