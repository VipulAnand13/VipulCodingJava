 package JavaArray;

import java.util.Arrays;

public class JavaArrayTrappingRainWaterProblem {

	public static void main(String[] args) {
		// TODO Find the Max Rain water that can be trapped in the histogram(building) of heights give in array:
		
		/*
		 * To solve this problem we need to find the left and right support on both sides of any element
		 *  support basically refers to the maximum value in the left and right side of the element.
		 *  
		 *  THis can be solved in two ways:
		 *  method1: Using two arrays for left and right support arrays
		 *         : this can be solved in Space complexity of O(n)
		 *  method2: Optimization in above solution by replacing the left and right support arrays with 2 pointers technique and
		 *  		 two variables for and right max values. 
		 *         : this will be solved in space complexity of O(1)
		 */
		// int[] histogramheight= {1,0,2,1,0,1,3,2,1,2,1};		
		int[] histogramheight= {3,4,5,1,7,2,6,5,4,1};	
		
		
		//Method1:
		int[] left_support=leftSupport(histogramheight);
		System.out.println("Left Support: "+ Arrays.toString(left_support));		
		
		int[] right_support=rightSupport(histogramheight);
		System.out.println("Right Support: "+ Arrays.toString(right_support));
				
		int trappingRainWaterCapacity=0;		
		
		for(int i=0; i<histogramheight.length; i++) {
			trappingRainWaterCapacity += 1 * (Math.min(left_support[i],right_support[i])-histogramheight[i]);
		}
		System.out.println("The Trapped Rain Water Capacity is:"+trappingRainWaterCapacity);
		
		//Method2:
		System.out.print("The Trapping Rain capacity of the buildings is: ");
				 
		System.out.println(rainWaterTrappingCapacity(histogramheight));
				
	}
	
	public static int[] leftSupport(int[] leftarr) {
		int[] leftarrclone= leftarr.clone();
		int largest=0;
		for(int m=0;m<leftarrclone.length;m++) {
			if(leftarrclone[m]> largest) largest=leftarrclone[m];
			
			else
				leftarrclone[m]=largest;
		}
		return leftarrclone;
	}
	
	public static int[] rightSupport(int[] rightarr) {
		int[] rightarrclone= rightarr.clone();
		int largest=0;
		for(int m=rightarrclone.length-1;m>=0;m--) {
			if(rightarrclone[m]> largest) largest=rightarrclone[m];
			
			else
				rightarrclone[m]=largest;
		}
		return rightarrclone;
	}
	
	//  *********************************************************************************************//
	
	//  SPACE COMPLEXITY is O(1):   OPTIMIZED APPROACH
	
	public static int rainWaterTrappingCapacity(int[] myarray) {
		int trappingCapacity=0;
		int left=0,right= myarray.length-1;
		int leftMax=0, rightMax=0;
		// Concept is to trap water we need left and right support and hence if we have leftMax and rightMax around an element then 
		// water can be trapped there.
		
		while(left<right) {
			if(myarray[left]<= myarray[right]) {
				if(myarray[left]> leftMax)  	leftMax=myarray[left];
						
				else   trappingCapacity += (Math.min(leftMax, myarray[right])-myarray[left]);   // leftMax-myarray[left]
				
				left++;									
			}                                 
			
			else {
				if(myarray[right]> rightMax)  rightMax=myarray[right];
					
				else  	trappingCapacity += (Math.min(myarray[left], rightMax)-myarray[right]);   // rightMax-myarray[right]
				
				right--;					
			}
		}
		return trappingCapacity;
	}

}
