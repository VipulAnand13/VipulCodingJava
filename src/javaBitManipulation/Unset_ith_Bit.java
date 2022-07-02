package javaBitManipulation;

public class Unset_ith_Bit {
	// To unset the i_th Bit which means to set the value of the i_th bit to 0.
	public static int unSetIthBit(int n,int i) {
		int mask= 1<<i;
		if((n&mask)==0) return n;	// since n and mask both are int var so (n&mask) also gives output in int and hence cant compare 
		                            // value of 1 as for 4: 100 the int equi of 1 is 4 and which will not be equal to 1 if we put in cond.		
		else n=n^mask;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(unSetIthBit(4,2));
	}

}
