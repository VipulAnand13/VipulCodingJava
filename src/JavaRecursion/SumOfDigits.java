package JavaRecursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Sum of the Digits of a number using Recursion.
     System.out.println(sumOfDigits(752));
	}
	
	public static int sumOfDigits(int n) {
		
		while(n>0) {
			return n%10 + sumOfDigits(n/10);
		}
		
		return 0;
	}

}
