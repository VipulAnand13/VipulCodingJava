package JavaArray;

public class JavaMaxSumSubarray {

	public static void main(String[] args) {
		// TODO Find max sum subarray and max sum of the subarray:
		
		//int[] numbers= {23,56,34,-45,78,-69,86,98,-93};
		int[] numbers= {6,-7,4,-2,1,5,-4};
		
		int maxSumResult=maxSumSubArray(numbers);
		System.out.println("Max Sum in any Sub Array: "+maxSumResult);
		

	}
	// KADANE's ALGORITHM is used for this problem:
	
	public static int maxSumSubArray(int[] number) {
		int currentSum=0;
		int maxSum=Integer.MIN_VALUE;
		int start=0,end=0;
		
		for(int z=0;z<number.length;z++) {
			currentSum +=number[z];
			
			
			//if(currentSum>0) maxSum = Math.max(maxSum, currentSum);
			
			if(currentSum>maxSum) { maxSum=currentSum;
			 end=z;
			}
				
			else if(currentSum<0) {
				    currentSum=0;
			        start=z;       }
		}
		System.out.println("start:"+start+" end:"+end);
		
		for(int z=start;z<=end;z++) System.out.print(number[z]+" ");
		
		System.out.println();
		
		return maxSum;
	}

}
