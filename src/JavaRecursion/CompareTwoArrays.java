package JavaRecursion;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said
		 *  to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
			Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
			
			Example 1:			
			Input:
			N = 5
			A[] = {1,2,5,4,0}
			B[] = {2,4,5,0,1}
			Output: 1
			Explanation: Both the array can be 
			rearranged to {0,1,2,4,5}
			
			Your Task:
			Complete check() function which takes both the given array and their size as function arguments and returns true if the arrays are equal else returns false.The 0 and 1 printing is done by the driver code.
			
			Expected Time Complexity : O(N)
			Expected Auxilliary Space : O(N)
		 */
		int A[] = {1,2,5,4,0};
		int B[] = {2,4,5,0,1};
		int n=A.length;
		System.out.println(checkComparison(A,B,n));

	}
	public static boolean checkComparison(int a[],int b[], int n) {
		boolean equalArray=true;
		Set<Integer> com= new HashSet<Integer>();
		for(int z: a) com.add(z);
		
		for(int z: b) {
			if(!com.contains(z)) equalArray = false;				
			}
		return equalArray;
	}

}
