package javaBitManipulation;

public class CountNumOfSetBits {
	// To find the number of Set bits which is the number of '1s' present in the number.
	public static int countNumOfSetBits(int n) {
		int count=0;
		int mask=1;  // since we need to check last bit hence we use mask=1 as it will do AND with last bit.
		
		while(n>0) {
		if((n&mask)==1) count++;    // checks if (last bit & 1)==1 then increases count     101 -> 1&1=1
		n=n>>1;						// right shift the given number by 1 to remove the last bit from number 101 -> 10
		}		
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countNumOfSetBits(5));
	}
   
	// Since we are iterating all the bits of the number hence Time Complexity will be log(N)  where base of log is 2.
	
	// When we iterate all digits of int(decimal num), num of iterations are log(N)+1 and we get TC of log(N) but here log is of base 10
}
