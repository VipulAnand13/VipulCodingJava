package javaBitManipulation;

public class Toggle_ith_Bit {
    // TO toggle a bit in a number,we can create a mask by shifitng 1 to ith position and then using XOR(^) operation between num and mask.
	//    0^1=1   
	//    1^1=0
	
	public static int toggleIthBit(int n,int i) {
		int mask= 1<< i;
		return n^mask;   // since function is accepting int so n^mask will return Integer value of the binary after toggling it.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toggleIthBit(5,1));
		
		// 5 -> 101   if we toggle 1st bit then binary becomes 111 and hence it returns Integer value of 111 :7
	}

}
