package com.sample;

public class MyCalculatorTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int n = -2;
		int p = 2;
		
		 if(n<0 || p<0)
	            throw new Exception("n and p should be non-negative");
		 else{
			 System.out.println((int)Math.pow((double)n,(double)p));
			
		 }
	}

}
import java.util.*;
import java.util.Scanner;

class myCalculator{
    int power(int n, int p) throws Exception{
        if(n<0 || p<0)
            throw new Exception("n and p should be non-negative");
        return (int)Math.pow((double)n,(double)p);
    }
}

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }