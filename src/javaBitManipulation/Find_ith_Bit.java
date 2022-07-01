package javaBitManipulation;

public class Find_ith_Bit {
	
	public static int findIthBit(int n, int i) {
		// To find the Ith bit, we need to do AND(&) operation between the number and mask. Mask should set for Ith bit
		// which is left shift '1' i times.   '<<' is left shift operator and '>>' is right shift operator.  
		// 0 & 1 = 0
		// 1 & 1 = 1
		
		 int mask = 1 << i;
		 if((n&mask) == 0) return 0;   /* we need to give if and else condition because function defined is int and if we return n&mask,
		 then it returns the Integer value of the bit. eg. 100 will return 4 for the bit having 1*/		 
		 else return 1;		 
	}
	
	public static void main(String[] args) {
		// TODO 
		System.out.println(findIthBit(5,2));
	}

}
