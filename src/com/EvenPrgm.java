package com;

import java.util.Scanner;

public class EvenPrgm {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int even=sc.nextInt();
		
		System.out.println("eneter the numbers");
		
		if(even%2==0) {
			System.out.println("It ia a even number");
			
		}
		
		else {
			System.out.println("other number");
		}
		
	}

}
