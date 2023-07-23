package com.learn.basicprograms.Stringprograms;

public class SwapingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Muralikrishna";
		String s2 = "Saisudha";
		
		swapStrings(s1,s2);

	}

	private static void swapStrings(String s1, String s2) {
	
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("After swaping :"+s1+","+s2);
		
	}

}
