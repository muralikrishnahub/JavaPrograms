package com.learn.basicprograms.Stringprograms;

public class CountNumberOfWords {

	public static void main(String[] args) {
		
		String str = "Hello Murali Good learning";
		
		method1(str);
	}

	

	private static void method1(String str) {
		String[] strArray = str.split(" ");
		System.out.println("No of words in Given String is "+strArray.length);
		
	}

}
