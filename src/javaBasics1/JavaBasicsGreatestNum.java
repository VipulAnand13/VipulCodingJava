package javaBasics1;

import java.util.Scanner;

public class JavaBasicsGreatestNum {
	public static void main(String[] args) {
		//To find the greatest number of the provided
		
		System.out.println("Enter the three numbers you want to compare");
		
		Scanner sc= new Scanner(System.in);
		int firstNum= sc.nextInt();
		int secondNum= sc.nextInt();
		int lastNum= sc.nextInt();
		sc.close();
		
		//If-else block to find greatest number
		/* 
	    if(firstNum> secondNum) {
		 
			if(firstNum> lastNum) System.out.println("Greatest Number is:"+ firstNum);
			else System.out.println("Greatest Number:"+lastNum);
		}
		else {
			if(secondNum>lastNum) System.out.println("Greatest Number is: "+ secondNum);
			else System.out.println("Greatest Number :"+lastNum);
		}
		*/
		
		//?: Ternary operator for comparing the three numbers
		int GreatestNum= (firstNum>secondNum && firstNum>lastNum?firstNum:secondNum>lastNum ?secondNum:lastNum);
	    System.out.println("Greatest Number of the three is "+ GreatestNum);
	}

}
