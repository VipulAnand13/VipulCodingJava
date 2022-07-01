package javaBitManipulation;

public class XORof1ToN {

	//XOR of all numbers 1 to N:
		public static int xorOfNum1toN(int N) {
			int count=0;
			for(int i=1;i<=N;i++) count=count^i;
			return count;
		}
		// (1^2): 001 ^ 010 =011 (3)
		// (1^2^3): 011^011= 000 (0)
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      System.out.println(xorOfNum1toN(2));
		}

}
