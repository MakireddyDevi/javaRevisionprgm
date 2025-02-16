package com;

import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		int age=sc.nextInt();
		
		System.out.println("Enter the vote country");
		
		String vote=sc.next().toLowerCase();
		
		if(age>18 && vote.equals("india")) {
			System.out.println("it is correct qualification");
		}
		else {
			System.out.println("not elgiable");
		}
		
	}

}
