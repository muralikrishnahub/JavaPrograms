package com.learn.basicprograms;

import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int number = sc.nextInt();
			
			if(number%2==0) {
				System.out.println("Entered number "+number+" is even number");
			}else {
				System.out.println("Entered number "+number+" is odd number");
			}
		}
	}

}
