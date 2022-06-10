package javaBasics1;

import java.text.MessageFormat;

public class JavaBasicsSwapNumbers {

	public static void main(String[] args) {
		// TODO Swap Numbers
		
		int a=34,b=47;
		
		//Using a third variable
		/*
		int c= a;
		a=b; b=c;
		System.out.println(MessageFormat.format("Swapped numbers: a={0} and b={1}", a,b));
		*/
		
		//Using arithmetic operation
		/*
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println(MessageFormat.format("Swapped numbers: a={0} and b={1}", a,b));
		*/
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(String.format("Swapped numbers: a=%d and b=%d", a,b));
		
		
		
	}

}
