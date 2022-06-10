package javaBasics2;

import java.util.Scanner;

public class JavaBasicsFibonacciSeries {

	public static void main(String[] args) {
	
		// TODO Fibonacci series upto n terms
		
				System.out.println("Enter limit of Fibonacci Series");
				Scanner sc =new Scanner(System.in);
				int fiboLimit= sc.nextInt();
				sc.close();
				int firstNum=0,secondNum=1;
				System.out.print(firstNum +" " + secondNum +" ");
				
				FiboSeries(firstNum,secondNum,fiboLimit-2);
			}
			public static void FiboSeries(int firstnum,int secondnum,int m) {
				if(m==0) System.out.println(": That is your Fibonacci series"); 
				
				else
				{
				int sum=firstnum+secondnum;
				System.out.print(sum +" ");
				firstnum=secondnum;
				secondnum=sum;
			
				FiboSeries(firstnum,secondnum,m-1);		
				}
				
			}
	

}
