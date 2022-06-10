package javaBasics1;

import java.text.MessageFormat;
import java.util.Scanner;

public class JavaBasicsAreaPerimeter {

	public static void main(String[] args) {
		// TO find the perimeter and area of the circle for the user radius.
		System.out.println("Enter radius of your sun ");
		
		//Radius input from user which can be double or float
		Scanner sc = new Scanner(System.in);
		float userRadius = sc.nextFloat();
		final float pi = 3.14f;
		sc.close();
		
		//Perimeter of circle
		System.out.println(String.format("Perimeter of your sun is %f",2*pi*userRadius));
		
		//Area of the circle
		System.out.println(MessageFormat.format("Area of your sun is {0}",pi*userRadius*userRadius ));

	}

}
