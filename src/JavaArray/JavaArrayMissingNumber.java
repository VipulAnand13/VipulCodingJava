package JavaArray;

public class JavaArrayMissingNumber {

	public static void main(String[] args) {
		/*
		 * Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
		 * Input:
			N = 5
			A[] = {1,2,3,5}
			Output: 4
			Expected Time Complexity: O(N)
			Expected Auxiliary Space: O(1)
		 */
		int A[] = {1,5,7,2,4,3};
		int n=7;
		int missingNum=missingNumber(A,n);
		System.out.println(missingNum);

	}
	
	public static int missingNumber(int arr[],int n) {
		int sum=0;
		while(n>0)  {
			sum +=n;
			n--;
		}
		for(int z:arr) {
			sum -= z;
		}
		
		return sum;
	}

}
