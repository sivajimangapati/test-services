package com.sample;

public class RegExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ip="9.12.12.01";
		String ss = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
		//System.out.println(ip.matches(ss));
		
		MyRegex myRegex = new MyRegex(ip);
		System.out.println(myRegex.isMatch());
		
		

	}

}
