package javaBasics2;

import java.text.MessageFormat;
import java.util.Scanner;

public class JavaBasicsMultiplicationTable {

	public static void main(String[] args) {
		// TODO Multiplication Table
		System.out.println("Whose Table you want to learn");
		Scanner sc = new Scanner(System.in);
		int tableNum= sc.nextInt();
		sc.close();
		int i=1;
        while(i<=10) {
        	int product=tableNum*i;
        	System.out.println(MessageFormat.format("{0} x {1} ={2}", tableNum,i,product));
        	i++;
        }
	}

}
