package JavaRecursion;

public class JavaRecurNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Print n Natural Numbers using Recursion:
		
		nNaturalNumbers(5);

	}
	
	public static void nNaturalNumbers(int n) {

		//Base condition1: To put a condition up to which Recursion function will be called.
//		if(n>0 ) {			
//			nNaturalNumbers(n-1);
//			System.out.println(n);
//		}
		
		//Base Condition2: To put a condition that what to do when the recursion hits the base condition.
		if(n==0) return;
		nNaturalNumbers(n-1);
		System.out.println(n);
		
	}

}
