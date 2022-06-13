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
		 *  method2: 
		 *         : this will be solved in space complexity of O(1)
		 */
		 int[] histogramheight= {1,0,2,1,0,1,3,2,1,2,1};		
		 
		int[] left_support=leftSupport(histogramheight);
		System.out.println("Left Support: "+ Arrays.toString(left_support));		
		
		int[] right_support=rightSupport(histogramheight);
		System.out.println("Right Support: "+ Arrays.toString(right_support));
				
		int trappingRainWaterCapacity=0;		
		
		for(int i=0; i<histogramheight.length; i++) {
			trappingRainWaterCapacity += 1 * (Math.min(left_support[i],right_support[i])-histogramheight[i]);
		}
		System.out.println("The Trapped Rain Water Capacity is:"+trappingRainWaterCapacity);
				
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

}
