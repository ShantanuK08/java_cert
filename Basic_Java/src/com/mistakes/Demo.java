package com.mistakes;

public class Demo {
	protected void finalize() {
		System.out.println("Object is being calculated");
	}
	
	
	
		public static void main(String [] args)
		{
			Demo d= new Demo();
			d=null;
			System.gc();
		}
	}
	
	


