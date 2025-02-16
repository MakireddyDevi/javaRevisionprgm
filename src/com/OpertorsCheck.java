package com;

import java.util.Scanner;

public class OpertorsCheck {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int marks=sc.nextInt();
			System.out.println("enter the Marks");
			
			if(marks>79 && marks<=80) {
				System.out.println("A grade");
			}
			
			if(marks<=70 && marks>=78) {
			System.out.println("B grade");
			}
			
			if(marks<35 && marks==35) {
				System.out.println(" pass");
			}
			
			else {
				System.out.println("fail");
			}
	}

}
