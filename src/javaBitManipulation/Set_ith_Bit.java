package javaBitManipulation;

public class Set_ith_Bit {
	//To set the i_th bit : which means to set the i_th bit equal to 1.
	public static int setIthBit(int n,int i) {
		int mask= 1<<i;
		if((n&mask)==0) n=n^mask;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setIthBit(8,0));   //(8,0) -> set bit 0 of 8 as 1 ->  8: 1000 -> output= 1001 : 9 
	}

}
