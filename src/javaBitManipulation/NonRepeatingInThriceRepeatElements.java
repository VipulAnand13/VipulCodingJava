package javaBitManipulation;

public class NonRepeatingInThriceRepeatElements {
	// To find out the Non Repeating Element in an array with Elements repeating thrice.
	
	static int nonRepeatingIn3Pairs(int[] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res= ~(res ^arr[i]);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myarr[] = {2,6,2,5,2,5,5};
		System.out.println(nonRepeatingIn3Pairs(myarr));
	}

}
