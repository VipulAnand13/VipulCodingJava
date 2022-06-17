package JavaRecursion;

public class JavaRecurNNumbersSum {

	public static void main(String[] args) {
		// TODO Create a Recursive function to get the sum of N numbers.
		System.out.println(nNumbersSum(5));
        System.out.println(nNumbersSquareSum(5));
	}
	public static int nNumbersSum(int n) {
		
		if (n==0) return 0;
		
		return nNumbersSum(n-1) + n;
	}
	
	public static int nNumbersSquareSum(int n) {
		
		if (n==0) return 0;
		
		return nNumbersSquareSum(n-1) + n*n;
	}

}
