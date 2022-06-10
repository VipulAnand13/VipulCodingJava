package javaBasics1;

import java.text.MessageFormat;
import java.util.Scanner;

public class JavaBasicsInputMultiply {

	public static void main(String[] args) {
		// To multiply two numbers given by user
		System.out.println("Enter the two integers to multiply");
		
		//Scanner class is used here to take input from the user by creating object sc
		Scanner sc = new Scanner(System.in);
		int firstNumber= sc.nextInt();
		int secondNumber = sc.nextInt();
		int product = firstNumber* secondNumber;
		sc.close();
		
		//String Interpolation: to insert values of variables within String statement using MessageFormat class
		//System.out.println(MessageFormat.format("The Product of the two numbers {0} and {1} is :{2}", firstNumber,secondNumber,product));
        
		//String format method
		//System.out.println(String.format("The Product of the two numbers %d and %d is :%d", firstNumber,secondNumber,product));
		
		//StringBuilder class
		System.out.println(new StringBuilder("Product of two numbers ")
				.append(firstNumber)
				.append(" and ")
				.append(secondNumber)
				.append(" is:")
				.append(product)	);
		
		//String concatenation to add values of variables
		//System.out.println("Product of the two numbers "+ firstNumber+ " and "+ secondNumber+ " is :"+ product);
	}
	

}
