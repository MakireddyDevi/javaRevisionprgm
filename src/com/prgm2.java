package com;

import java.util.Scanner;

public class prgm2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day");
		
		int day=sc.nextInt();
		
		if(day==1) {
			System.out.println("Monday");
		}
		
		else if(day==2) {
			System.out.println("Tuesday");
		}
		
		else if(day==3) {
			System.out.println("Wednesday");
		}
		else if(day==4) {
			System.out.println("thurday");
		}
		else if(day==5) {
			System.out.println("friday");
		}
		
		else if(day==6) {
			System.out.println("saturday");
		}
		else if(day==7) {
			System.out.println("holiday");
		}
		
		else {
			System.out.println("invalid prgm");
		}
	}

}
