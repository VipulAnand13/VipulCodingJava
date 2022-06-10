package javaBasics2;

import java.util.Scanner;

public class JavaBasicsSmallestNumMethod {

	public static void main(String[] args) {
		// TODO Create a method to find smallest of three numbers
		System.out.println("Enter the three numbers");
		Scanner sc= new Scanner(System.in);
		int firstnum=sc.nextInt();
		int secondnum=sc.nextInt();
		int thirdnum=sc.nextInt();
		sc.close();
		
		System.out.print("Smallest of the three numbers:"+SmallestOfThree(firstnum,secondnum,thirdnum));
		
	}
	
	public static int SmallestOfThree(int firstNum,int secondNum,int thirdNum) {
	   int[] num= {firstNum,secondNum,thirdNum};
	   for(int x:num) {
		   if(x<firstNum) firstNum=x;
	   }
		return firstNum;
	}
	

}
