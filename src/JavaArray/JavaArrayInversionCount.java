package JavaArray;

public class JavaArrayInversionCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted 
			then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
			Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
			
			Input: N = 5, arr[] = {2, 4, 1, 3, 5}
			Output: 3
			Explanation: The sequence 2, 4, 1, 3, 5 
			has three inversions (2, 1), (4, 1), (4, 3).
		 */
		
		int[] a= {2, 4, 1, 3, 5};
		System.out.println(inversionCount(a));

	}
	
	//Brute-Force Approach:
	static int inversionCount(int[] arr) {
		int count=0;
		int n= arr.length;
		for(int i=0; i<n-1;i++) {
			for(int z=i+1;z<n;z++) 	if(arr[z]<arr[i]) count++;						
		}
		
		return count;
	}
	
	//Optimized approach:

}
