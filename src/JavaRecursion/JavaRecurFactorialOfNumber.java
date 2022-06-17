package JavaRecursion;

public class JavaRecurFactorialOfNumber {

	public static void main(String[] args) {
		// TODO Factorial of a Number using Recursion:
		
		System.out.println(factorialOfTheNumber(2));

	}
	public static int factorialOfTheNumber(int a) {
		if(a==0) return 1;
	
		return factorialOfTheNumber(a-1)*a;
	}

}
