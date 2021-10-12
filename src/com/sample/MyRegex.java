package com.sample;

public class MyRegex {
	
	private static String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
	String str;
	public MyRegex(String ip) {
		
		this.str=ip;
	}
	public boolean isMatch() {
		
		if(str.matches(pattern)) {
			return true;
		}
		
		return false;
	}
}
