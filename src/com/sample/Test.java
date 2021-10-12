package com.sample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world .. !");
		
		System.out.println(divide(4, 0));
		
	}
	
	public static int divide(int a, int b) {
		 int c = -1;
		 
		 try {
		 c = a / b;
		 } 
		 catch (Exception e) {
		 System.err.print("Exception ");
		 } 
		 finally {
		 System.err.println("Finally ");
		 }
		 
		 return c;
		}

}
