package com.Object_class;
import java.util.*;
class Library {
	int acc_num;
	String title;
	String author;
	Scanner in=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter accession number");
		acc_num=in.nextInt();
		System.out.println("Enter title of the book");
		title= in.next();
		System.out.println("Enter author name");
		author =in.next();
	}
	void compute()
	{
		int n,fine;
		System.out.println("Enter number of days the book is returned late");
		n=in.nextInt();
		fine=n*2;
		System.out.println("Fine to be paid\t"+fine);
	}
	void display()
	{
		System.out.println("Accession Numbeer\t" +"Title\t"+"Author");
		System.out.println(acc_num+"\t"+title+"\t"+author);
	}
	public static void main(String args[])
	{
		Library ob=new Library();
		ob.input();
		ob.compute();
		ob.display();
	}

}
