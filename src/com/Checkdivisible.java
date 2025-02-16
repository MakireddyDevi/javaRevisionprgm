package com;

import java.util.Scanner;

public class Checkdivisible {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" enter the number");
		
		int div =sc.nextInt();
		if(div%5==0 && div%11==0) {
			System.out.println( " it is divsible by both numbers");
		}
		
		else {
			System.out.println("Enter number is not divisible by both 5 and 11");
		}
		
	}

}
