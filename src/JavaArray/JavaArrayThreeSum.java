package JavaArray;


import java.util.Arrays;

public class JavaArrayThreeSum {

	public static void main(String[] args) {
		// TODO Find the three Numbers in an unsorted array with the given sum.
		/*
		 * TO work upon this problem we have below approaches:
		 * 1. Brute-Force approach: By iterating over the array in three loops and adding up the sum till we get the given Sum.
		 *                          TC will be O(n3).
		 * 2. Using twoSum FUnction and iterating over the array once. Tc :O(NlogN +N2)=O(N2) 
		 */
          int[] myArray= {1,2,4,7,3,5,-2,1};
          int givenSum=9;
          threeSum(myArray, givenSum);
	}

	public static void threeSum(int[] arr,int givenSum) {
		
		Arrays.sort(arr);
		int count=0;
		for(int j=0;j<arr.length;j++) {
			int twoSumReq= givenSum-arr[j];
			int index=j;
			boolean isThreeSumPresent=twoSumSorted(arr, twoSumReq, index);
			if(isThreeSumPresent==true) count++;			
		}
		if(count==0) System.out.println("Sorry,three numbers with the given sum is not present.");
		
		else System.out.println("Congrats,three numbers with the given sum is present ");
	}
	
	
	public static boolean twoSumSorted(int[] arr, int givenSum,int index) {
        int i=0, j= arr.length-1;
		
		 while(i<j) {
			if(i==index) i++;
			
			else if(j==index) j--;
			
			else if(arr[i]+arr[j]== givenSum) {
				i++;
				return true;
			}
			
			else if(arr[i]+arr[j]> givenSum) j--;
			
			else if(arr[i]+arr[j]< givenSum) i++;
						
		}
		
		 return false;
	}
}
