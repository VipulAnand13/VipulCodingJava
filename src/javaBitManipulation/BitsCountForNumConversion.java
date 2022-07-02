package javaBitManipulation;

public class BitsCountForNumConversion {
	// To find out the number of bit conversions required to change number a to b.
	
	// Compare the last bits of the numbers and modify the count,then discard the last bit(right shift) to check the next bit of the numbers.
	static int bitsCountForNumberConversion(int a,int b) {
		int count=0;
		while(a>0 | b>0) {                // loop executes until both numbers become less than zero  
			if((a&1)!=(b&1)) count++;     // checks the last bit of the numbers if the last bit is different, then increments the count 
			a=a>>1; b= b>>1;			  // right shift the numbers to discard the last bit of the numbers.
		}
		return count;					 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bitsCountForNumberConversion(5,4));
		
	}

}
