package com;

import java.util.Scanner;

public class prgm3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		
		System.out.println("enter the day");
		
		 String days=sc.next().toLowerCase();
		 
		
		if(days.equals("monday")== days.equals("friday")) {
			System.out.println("week days");
			
		}
		
		 if(days.equals("saturday")== days.equals("sunday")) {
			System.out.println("weekend");
		}
		
		else {
			System.out.println("invalid");
		}
			
		}
	
	
}
