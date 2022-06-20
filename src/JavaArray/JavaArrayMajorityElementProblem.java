package JavaArray;

import java.util.Arrays;

public class JavaArrayMajorityElementProblem {

	public static void main(String[] args) {
		// TODO Java Majority Element Problem: TO find the element that repeat more than n/2 times:
		
		/*
		 * initial Approach:This will give output in O(NlogN) Time complexity. 1. Sort the array    2. FInd the element at n/2 position.
		 * 
		 * Optimized approach(Moore's Voting Algorithm) : CurElement is taken as variable which takes the ith element in array and
		 * at the end whichever element is present in the variable has the chance of being majority element but needs to check if it 
		 * is present more then n/2 times.
		 */
		
		//int[] helloArray= {4,6,4,4,7,8,4,3,4};
		int[] helloArray= {2,7,2,7,2,7,7,2};
		
		Arrays.sort(helloArray);
		System.out.println(Arrays.toString(helloArray));
		int element=helloArray[helloArray.length/2];
		int checkMajorElement=0;
		for(int y : helloArray) {
			if(y==element) checkMajorElement++;
		}
		if(checkMajorElement> helloArray.length/2) System.out.println("The majority element is:" +element);
		
		else System.out.println("Majority Element not present");
		System.out.println(majorityElement(helloArray));
	}
	
	//    MOORE's VOTING ALGORITHM:
	
	static int majorityElement(int[] arr) {
		int curElement=-1;
		int n=arr.length;
		int count=0;
		int flag=0;
		for(int i=0; i<n; i++) {
			if(count==0) {
				curElement=arr[i];
				count=1;
			}
			else {
				if(arr[i] ==curElement) count++;
				
				else count--;
			}
		}
		
		for(int z:arr) {
			if(z==curElement) flag++; 
		}
		
		if(flag>n/2) return curElement;
		
		else return -1;	
		
	}

}
