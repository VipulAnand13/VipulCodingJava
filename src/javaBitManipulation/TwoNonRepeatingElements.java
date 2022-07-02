package javaBitManipulation;

public class TwoNonRepeatingElements {
	// To find the two non repeating elements in an array where all other elements are repeating.
	//arr[] ={2,5,7,9,2,5}
	
	// Logic:To find the XOR of all the elements, the result will give XOR of the two non repeating elements.   
	//		  XOR: 2 ^ 5 ^ 7 ^ 9 ^ 2 ^ 5 = 7^9
	//       Now to extract the numbers, we need to fetch the "Least Significant Set Bit"(LSSB) (first element from right which is 1)
	//          7 ^ 9 = 0111 ^ 1001 = 1110 -> here the LSSB is 1st bit (after 0 at the right 0th bit).
	//		 which will imply that the two elements differ in that bit and one element is 0 for that bit and other is 1 for that bit.
	           
	//       Thats why, we get XOR as 1 in that bit. Based on this bit position we create mask and divide numbers into 2 groups.
	//             Two groups: **0* and **1*
	//		 One with 1 at that bit and other with 0 at that bit.
	
	//       Next we do the XOR of one of these groups with the output of XOR of all elements. Output of this will be one non repeating num
	//          Output of XOR of all elements: 7^9= 1110 and it will XOR with elements having **0* : 1110^ **0* = 0111 :7
	//		 At last to find the second non repeating number,we will XOR this first non repeating num with the output of XOR of all elements.
	//          last: 7 ^ (7^9) = 9
	
	public static int[] twoNonRepeatingElement(int[] arr, int[] printArray) {
		
 		int  nonRepeatELement=0;
		for(int e: arr) {
			nonRepeatELement = nonRepeatELement^e;   // XOR output of all elements
		}
		
		int temp= nonRepeatELement & (~(nonRepeatELement-1));    // to find the LSSB
		int mask = nonRepeatELement&temp;                        // to find mask to divide groups
		
		temp=0;
		for(int e: arr) {
			if((e&mask)==0) temp=e^temp;                //XOR of elements with 0 at LSSB position, which gives 1st non-repeat element 
		}
		
		printArray[0]=temp;
		printArray[1]=temp^nonRepeatELement;            // Second non- repeat element
		 
		return printArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr= {2,4,2,15,12,4};
		int[] printArray= new int[2];
		twoNonRepeatingElement(myarr,printArray);
		for(int e: printArray) System.out.print(e + " ");
	}

}
