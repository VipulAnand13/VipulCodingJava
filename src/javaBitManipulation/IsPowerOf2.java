package javaBitManipulation;

public class IsPowerOf2 {
	//To check if the given number is a power of 2 like 2,4,8,16,32,64,128,....
	
	//Trick for this question is to do AND operation between the number and (number-1), if result is 0 then Yes power of 2 else no.
	public static boolean isPowerOf2(int n) {
		return ((n&n-1)==0);
	}
	
	//  n=16  (2^4):  10000 
	//  n-1=15     :  01111   
	//  n & n-1    :  00000 = 0 = (n & n-1)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOf2(16));
	}

}
