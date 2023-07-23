package com.learn.basicprograms.Stringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergingTwoStringArrays {

	public static void main(String[] args) {
		
		String[] strArray1 = {"Murali","Krishna","MADDIRALA"};
		String[] strArray2 = {"Sai","Sudha","MADDIRALA"};
		
		mergeTwoArrays(strArray1,strArray2);

	}

	private static void mergeTwoArrays(String[] strArray1, String[] strArray2) {
		
		Set finalSet = new TreeSet();
		for(int i=0;i<strArray1.length;i++) {
			finalSet.add(strArray1[i]);
		}
		for(int i=0;i<strArray1.length;i++) {
			finalSet.add(strArray2[i]);
		}
		
		System.out.println("Final list"+finalSet);
		Object[] MergedArray=finalSet.toArray();
		for(int i=0;i<MergedArray.length;i++) {
			System.out.println("Final Array value idx "+i+" "+MergedArray[i]);
		}
		
		
	}

}
