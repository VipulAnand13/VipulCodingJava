package javaBasics1;

import java.util.Scanner;
public class JavaBasicsGradingCategories {

	public static void main(String[] args) {
		// TODO Create a grading system
		
		System.out.println("Enter your marks");
		Scanner sc = new Scanner(System.in);
		Float yourMarks= sc.nextFloat();
		String grade;
		sc.close();
		
		if(yourMarks<40) grade="F";
		else if(yourMarks>=40 && yourMarks<60) grade="D";
		else if(yourMarks>=60 && yourMarks<75) grade="C";
		else if(yourMarks>=75 && yourMarks<90) grade="B";
		else if(yourMarks>=90 && yourMarks<95) grade="A";
		else
			grade="A+";
		
		switch(grade)
		{
			case "F":
				System.out.println("You have not been Promoted.");
		        break;
			case "A+":
				System.out.println("You have topped the class. Get your certificate of Excellence");
		        break;
			case "A":
				System.out.println("You have got the Elite grade and promoted to next class");
				break;
			case "B":
				System.out.println("You have got Distinction and promoted to next class");
				break;
			case "C":
				System.out.println("You have got second grade, improve your grades. you are promoted");
				break;
			case "D":
				System.out.println("You have just passed, this time you are promoted");
				break;
			 default:
				System.out.println("Invalid input");
		}
		

	}

}
