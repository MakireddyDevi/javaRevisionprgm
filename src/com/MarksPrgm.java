package com;

import java.util.Scanner;

public class MarksPrgm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter th marks");
		
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("A grade");
		}
		
		else if(marks>80 && marks<89) {
			System.out.println(" B grade");
		}
		
		else if(marks<60 && marks >=50) {
			System.out.println("C grade");
		}
		
		else {
			System.out.println("Fail");
		}
	}

}
