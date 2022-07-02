package javaBitManipulation;

public class OneNonRepeatingElement {
	// To find out the only Non Repeating Element in the array of numbers.
	
	// To solve : Do XOR operation of all the elements in the array and the non repeating element will be present as result.
	//            2^7^3^7^8^2^3 = 8 (all duplicate elements will cancel each other)
	
	public static int nonRepeatingElement(int[] arr) {
		int  nonRepeatELement=0;
		for(int e: arr) {
			nonRepeatELement = nonRepeatELement^e;
		}
		return nonRepeatELement;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {2,7,3,7,8,2,3};
		System.out.println(nonRepeatingElement(myArray));
	}

}
