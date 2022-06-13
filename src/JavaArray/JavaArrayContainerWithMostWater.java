package JavaArray;

public class JavaArrayContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Find the biggest container of unit width and given height in array:
		
		/*   The given problem can be solved in two ways:
		 *   Method1: To Traverse all the sub arrays in the given array and find max water capacity.
		 *            Time complexity: O(n2)
		 *   Method2: To use the 2 pointers approach 
		 * 			  Time complexity: O(n)
		 */
		
		int[] waterContainerHeight= {1,8,6,2,5,4,8,3,7};
		int maxWaterCapacity=twoPointersApproach(waterContainerHeight);
		System.out.println("Max Water Capacity in the container is: "+maxWaterCapacity);
		

	}
	
	public static int twoPointersApproach(int[] waterCapacity) {
		int maxCapacity=0,capacity=0;
		
		        //       Method2: Two pointers approach:
				/*
				 * One variable at the left extreme and other at the right extreme
				 *  while(left<right){
				 *  
				 *     waterCapacity= width* height= 1* min(waterContainerHeigh[left],waterContainerHeigh[right])
				 *     
				 *     whichever value is min(waterContainerHeigh[left],waterContainerHeigh[right]): 
				 *     the left or right pointer will be shifted.
				 *  }
				 */	
		int leftCursor=0; int rightCursor=waterCapacity.length-1;
		while(leftCursor<rightCursor) {
			capacity= (rightCursor-leftCursor)*(Math.min(waterCapacity[leftCursor], waterCapacity[rightCursor]));
			
			if(capacity> maxCapacity) maxCapacity=capacity;
			
			if(waterCapacity[leftCursor]>waterCapacity[rightCursor]) rightCursor--;
			else leftCursor++;
		}
		
		return maxCapacity;
	}

}
