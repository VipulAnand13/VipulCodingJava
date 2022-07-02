package javaBitManipulation;

public class SwapTwoBits {
	//To swap two bits in a given Integer.
	
	public static int swapBits(int n,int i, int j) {
		
		int i_bit= (n>>i)&1;          // to find out the ith bit -> right shifted the number i times and assigned it to var 
		int j_bit= (n>>j)&1;	      // to find out the jth bit -> right shifted the number j times and assigned it to var 	
		
		if(i_bit != j_bit) {          // checking if the bits are different. 

			int mask= 1<<i | 1<<j;    // creating mask as ..0001000100.. 1 shifted to i and j positions
			n= n^mask;                // perform XOR operation to toggle the value of bits present in i, j positions.
		}
		
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(swapBits(8,3,1));
	}

}
