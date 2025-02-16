package com;

import java.util.Scanner;

public class LeapYearPrgm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter th value");
		
		int leap=sc.nextInt();
		 if(leap%4==0 && leap%100!=0 ||(leap%400==0) ) {
			 
				 
			System.out.println("is a leap year");
		 }
		 
		 else {
			 System.out.println(" it is not leap year");
		 }
	}

}
