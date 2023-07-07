package com.learn.basicprograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		final int[] a = { 10, 20, 30, 40, 50, 50, 10, 20 };
		
		removeDuplicates(a);

	}

	private static void removeDuplicates(int[] a) {
		
		Set arraySet = new TreeSet();
		for(int i=0;i<a.length;i++) {
			arraySet.add(a[i]);
		}
		
		System.out.println(arraySet);
		
		
	}

}
