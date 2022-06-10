package javaBasics1;

import java.util.Scanner;

public class JavaBasicsInchesToMeters {

	public static void main(String[] args) {
		// TO convert inches to meters
		
		System.out.println("Enter your shirt length in inches");
		Scanner sc = new Scanner(System.in);
		double shirtLen = sc.nextDouble();
		sc.close();
	
		final double convertMetric = 0.0254;
		
		System.out.println(String.format("Your need %.3f m cloth for your shirt", shirtLen*convertMetric));
	}

}
