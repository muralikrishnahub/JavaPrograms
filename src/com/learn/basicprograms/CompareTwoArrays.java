package com.learn.basicprograms;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		final int[] array1 = { 1, 2, 3, 4, 5 };
		final int[] array2 = { 1, 2, 3, 4, 5 };
		
		compareArrays(array1,array2);
	}

	private static void compareArrays(int[] array1, int[] array2) {
		boolean result = Arrays.equals(array1, array2);
		System.out.println("Result "+result);
		
	}
}
