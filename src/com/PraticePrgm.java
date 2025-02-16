package com;

import java.util.Scanner;

public class PraticePrgm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the day");
		String day=sc.nextLine().toLowerCase();

        if (day.equals("monday") || day.equals("friday")) {
            System.out.println("It is a weekday");
        } else if (day.equals("sunday")) {
            System.out.println("It is the weekend");
        } else {
            System.out.println("Invalid day entered or it is another weekday.");
        }
		
		//String day=sc.nextLine().toLowerCase();
		
		//if(day.equals("monday") ) {
		//	System.out.println("it is a week days");
	//	}
		
	/*	else if(day.equals("tuesday")) {
			System.out.println("it is week days");
		}
		
		
		if(day.equals("sunday")) {
			System.out.println("it is weekend");
		}
		
		
	else {
		System.out.println("invalid");
	}
	}*/
	}
}
