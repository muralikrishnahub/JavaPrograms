package com.learn.basicprograms;

import java.util.Arrays;

public class LargestNumberinArray {

	public static void main(String[] args) {
		
		final int[] array = {12,34,56,656,12,13,454,32};
		
		findLargestNumInArray(array);
		
		findLargestNumInArrayUsingArraysSort(array);

	}

	private static void findLargestNumInArrayUsingArraysSort(int[] array) {
		System.out.println("Array length"+array.length);
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
		
	}

	private static void findLargestNumInArray(int[] array) {
		
		int largestNumber = 0;
		
		for(int i=0;i<array.length;i++) {
			if(largestNumber<array[i]) {
				largestNumber=array[i];
			}
		}
		
		System.out.println("Largest number in array is :"+largestNumber);
	}

}
