package javaBasics1;

import java.util.Scanner;

public class JavaBasicsLeapYear {

	public static void main(String[] args) {
		// TO state a given year is leap year or not.
		
		System.out.println("Enter the year you wanna check");
		
		Scanner sc= new Scanner(System.in);
		int checkYear= sc.nextInt();
		sc.close();
        
		//For a leap year, year should be divisible by 4 but for centuries divisible by 400, are also leap year.
		if(checkYear%4 ==0 && checkYear%100 ==0)
		{
			if(checkYear%400==0)
				System.out.println("LEAP year you got");
			
			else
				System.out.println("Its not a LEAP year");
		}
		else if(checkYear%4 ==0 && checkYear%100 !=0) System.out.println("LEAP YEAR BRO!");
		
		else  System.out.println("NON-LEAP Year is what u got...");
	}

}
