package com.learn.basicprograms;

import java.util.Scanner;

public class AddtwoNumbers {

	public static void main(String[] args) {
		int n1,n2,sum;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Number :");
			n1= sc.nextInt();
			
			System.out.println("Enter Second Number :");
			n2= sc.nextInt();
			
			sum=n1+n2;
			
			System.out.println("Addition of 2 numbers :"+sum);
			
				
		}
	}

}
