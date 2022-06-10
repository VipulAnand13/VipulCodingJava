package javaBasics2;

import java.util.Scanner;

public class JavaBasicsFactorial {

	public static void main(String[] args) {
		// TO find the factorial of a number using Recursion technique
		
				System.out.println("Enter the number to find factorial:");
				Scanner sc = new Scanner(System.in);
				int factorialNum= sc.nextInt();
				sc.close();
				
				System.out.println(factorialNumber(factorialNum));
						
			}
			
			
			//Method to call for recursion:
			public static int factorialNumber(int n) {
				int factorialOutput=1;
				if(n>=1)
					factorialOutput=n*factorialNumber(n-1);
				
				else
					factorialOutput *= 1;
				return factorialOutput;

	}

}
