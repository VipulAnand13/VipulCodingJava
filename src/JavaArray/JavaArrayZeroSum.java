package JavaArray;

import java.util.HashSet;
import java.util.Set;

public class JavaArrayZeroSum {

	public static void main(String[] args) {
		// TODO Find if there is any sub-array with Zero Sum:
		
		/*
		 * TO solve this problem there are 2 approaches:
		 * 1. Brute-Force approach: all the elements are traversed and the variable sum keeps on adding elements till it gets to zero-sum.
		 *                          time complexity is O(n2).
		 * 
		 * 2. Prefix-Sum approach:Here we keep a record of the sum before adding any element to it and hence prefix sum is the concept.
		 *                        So whenever in this prefix sum record, if we encounter the same sum value, then it proves that 
		 *                        sub-array with zero sum is present .
		 *                        This record of prefix sum can be stored in an array but then to access it it will be an O(n2)operation.
		 *                        So to solve this in O(n), we need to use HashSet or HashMap.
		 */           
		
		 int[] array= {2,3,1,-4,3,-2};
		
		 prefixSum(array);
	}
	
	public static void prefixSum(int[] myarr) {
		
		Set<Integer> setPrefixSum= new HashSet<Integer>();    //HashSet implements "Set" data structure.
		int sum=0;
		int count=0;
		for(int z=0; z<myarr.length; z++) {
			sum += myarr[z];
			
			if(!(setPrefixSum.contains(sum))) {
				setPrefixSum.add(sum);
			}
			
			else
				count++;
		}
		if(count!=0) System.out.println("The number of Zero-Sum Subarrays:"+ count);
		else System.out.println("There are no zero-sum subarrays");
	}

}
