package com;

import java.util.Scanner;

public class vowelcheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the vowels");
		char ch =sc.nextLine().toLowerCase().charAt(0);
		
		if(ch =='a' || ch =='e' || ch=='i' || ch =='o' || ch=='u') {
			System.out.println( "is constant");
	}
		else if(ch>'b' && ch<'z') {
			System.out.println( "it is not constant");
		}
		
		else {
			System.out.println("inavlid prgm");
		}

}
}