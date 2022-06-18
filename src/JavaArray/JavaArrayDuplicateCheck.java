package JavaArray;

import java.util.HashSet;
import java.util.Set;

public class JavaArrayDuplicateCheck {

	public static void main(String[] args) {
		/* 
		 * Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring
		   more than once in the given array.
		
			Example 1:
			Input:
			N = 4
			a[] = {0,3,1,2}
			Output: -1
			Explanation: N=4 and all elements from 0
			to (N-1 = 3) are present in the given
			array. Therefore output is -1.
			
			Your Task:
			Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements
			that occur more than once in the given array in sorted manner. If no such element is found, return list containing [-1]. 
			
			Expected Time Complexity: O(n).
			Expected Auxiliary Space: O(n).
			Note : The extra space is only for the array to be returned.
			Try and perform all operation within the provided array. 
		 */
		int N = 9; // 0+1+2+3=6
		int a[] = {0,2,1,2,3,4,3,5,5};
        duplicateNumber(a,N);
        
	}
	
	   public static void duplicateNumber(int arr[],int n){
		   Set<Integer> duplicateNum = new HashSet<Integer>();
		   int dupcount=0;
		   for(int z=0;z<n;z++) {
			   if(duplicateNum.contains(arr[z])) {
				   arr[dupcount]=arr[z];
				   dupcount++;
			   }
			   else
				   duplicateNum.add(arr[z]);
		   }
		   duplicateNum.clear();
		   
		   if(dupcount==0)   duplicateNum.add(-1);
		   
		   else {	 		   
		   for(int z=0;z<dupcount;z++) {
			   duplicateNum.add(arr[z]);
		       }
		   } 
		   System.out.println(duplicateNum);
		    
	}

}
