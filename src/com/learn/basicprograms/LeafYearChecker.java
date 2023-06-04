package com.learn.basicprograms;

import java.util.Scanner;
/*how to determine whether a year is a leap year mathematically: To determine whether a year is a leap year, follow these steps:
If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
The year is a leap year (it has 366 days).
The year is not a leap year (it has 365 days).*/
public class LeafYearChecker {

	public static void main(String[] args) {
		boolean isLeap=false;
		int year=0;
		try(Scanner sc = new Scanner(System.in)){
			 year = sc.nextInt();
			
			if(year%4==0) {
				if(year%100==0) {
					if(year%400==0) {
						isLeap=true;
					}else {
						isLeap=false;
					}
				}else {
					isLeap=true;
				}
			}else {
				isLeap=false;
			}
			
		}
		
		if(isLeap == true) {
			System.out.println(year + "is a leap year");
		}

	}

}
