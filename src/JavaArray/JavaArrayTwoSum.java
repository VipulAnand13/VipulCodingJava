package JavaArray;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

public class JavaArrayTwoSum {

	public static void main(String[] args) {
		// TODO Find Two numbers in a sorted array with the given sum:
		
		/*
		 * Since the array is sorted we will use two pointers and property of sorted array that is we will move the right pointer 
		 * if the sum is more than given sum and will move the left pointer if it is less than the given sum.
		 */
		int[] myArray= {1,2,4,6,8,10,12};
		int sum=10;
		twoSumSorted(myArray,sum);	
		
		int[] array= {1,6,4,2,10,8,12};
		twoSumUnsorted(array,sum);
	}
	
	public static void twoSumSorted(int[] arr, int givenSum) {
         int i=0, j= arr.length-1;
		
		 while(i<j) {
			if(arr[i]+arr[j]== givenSum) {
				System.out.println(MessageFormat.format("Numbers with given sum {0} is preset:", givenSum)+arr[i] +","+arr[j]);
				i++;
			}
			
			else if(arr[i]+arr[j]> givenSum) j--;
			
			else if(arr[i]+arr[j]< givenSum) i++;
			
			else System.out.println("NOT PRESENT!!!!");
		}
		
	}
	
	public static void  twoSumUnsorted(int[] array,int givenSum) {
		/*
		 * To find the numbers with the given Sum in an unsorted array, we have 3 approaches:
		 * 1.Brute-Force Approach: To iterate over all the elements and Find the numbers with given Sum in O(n2).
		 * 2.Use Set Data structure: TC will be O(n) and SC will be O(n).
		 * 3.Sort the array and use TwoSum Function : TC: O(NlogN + N)=O(NlogN) and SC:O(1). 
		 * Lets try the Set data structure approach.
		 */
		
		Set<Integer> twoSumSet = new HashSet<Integer>();
		int count=0;
		for(int j=0;j<array.length;j++) {
			twoSumSet.add(array[j]);
		}
		
		for(int j=0;j<array.length;j++) {
			int secondNumber=givenSum - array[j];
			
			if(twoSumSet.contains(secondNumber)) {
				System.out.println("The  given sum is present."+array[j]+" and "+secondNumber);
				count++;
			}
						
		}
		if(count==0) System.out.println("The given Sum is not present.");

	}

}
