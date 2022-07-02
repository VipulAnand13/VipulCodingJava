package javaBitManipulation;

public class ReverseAllBitsOfUnsignedInteger {
	//To Reverse all the bits of an unsigned Integer
	
	public static long reverseAll32Bits(long n) {
		 for(int i=0;i<32/2;i++) {
			 int ith= (int) (n>>i)&1;
			 int jth= (int) (n>>31-i)&1;
			 
			 if(ith != jth) {
				 long mask=1L<<i | 1L<<31-i;
				 n= n^mask;
			 }
		 } 
		 return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseAll32Bits(5));
	}

}
