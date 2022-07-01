package javaBitManipulation;

public class CheckNumIsEvenOrOdd {
	// To check if the number is even or odd:
	// Logic here is to check the last bit of the number. If it is 1 then the number is odd else even.
	
	public static void numIsEvenOrOdd(int n) {
		// mask used here is 1 hence directly AND operation with 1.
		if((n&1)==1) System.out.println("ODD");
		else System.out.println("EVEN");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       numIsEvenOrOdd(11);
	}

}
