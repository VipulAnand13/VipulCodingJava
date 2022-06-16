package JavaArray;

import java.util.Arrays;

public class JavaArrayMajorityElementProblem {

	public static void main(String[] args) {
		// TODO Java Majority Element Problem: TO find the element that repeat more than n/2 times:
		
		/*
		 * initial Approach: 
		 * 1. Sort the array
		 * 2. FInd the element at n/2 position. 
		 */
		
		//int[] helloArray= {4,6,4,4,7,8,4,3,4};
		int[] helloArray= {2,7,2,7,2,7,7,7,2};
		
		Arrays.sort(helloArray);
		System.out.println(Arrays.toString(helloArray));
		
		System.out.println("The majority element is:"+ helloArray[helloArray.length/2]);

	}

}
