package com;

import java.util.Scanner;

public class decrementPrgm {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter the values" +a );
	
		System.out.println(a++); //5
		System.out.println(++a);//7
		
		System.out.println(a);//7
		
		System.out.println(a++);//7
		
		System.out.println(--a);//7
		
		System.out.println(a);//7
		
		System.out.println(++a);//8
		
		System.out.println(a--);//8
		
		System.out.println(a);//7
		
		System.out.println(a++);//7
		
		System.out.println(--a);//7
		System.out.println(a);//7
		
	}

}
