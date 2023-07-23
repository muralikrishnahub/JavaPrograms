package com.learn.basicprograms.Stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Muralikrishna";
		
		System.out.println("Given String "+str);
		//method1(str);
		method2(str);
		method3(str);
		//method4(str);
		//method5(str);

	}

	private static void method3(String str) {
		StringBuilder reverseString = new StringBuilder(str);
		System.out.println("Reverse String 3 :"+ reverseString.reverse().toString());
		
	}

	private static void method2(String str) {
		StringBuilder reverseString = new StringBuilder();
		
		for(int i=(str.length()-1);i>=0;i--) {
			reverseString.append(str.charAt(i));
		}
		
		System.out.println("Reverse String 2 : "+reverseString);
	}

	private static void method1(String str) {
		
		String reverseString = new String();
		
		for(int i=(str.length()-1);i>=0;i--) {
			reverseString+=(str.charAt(i));
		}
		
		System.out.println("Reverse String 1 : "+reverseString);
		
	}

}
