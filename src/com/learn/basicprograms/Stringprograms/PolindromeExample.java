package com.learn.basicprograms.Stringprograms;

public class PolindromeExample {

	public static void main(String[] args) {
		checkPalindrome("maddaam");
	}

	private static void checkPalindrome(String str) {
		String reverse = ""; 	
		int length=str.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			System.out.println(str +" is polidrome");
		}else {
			System.out.println(str +" is not polidrome");
		}
		
	}

}
