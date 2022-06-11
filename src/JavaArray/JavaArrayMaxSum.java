package JavaArray;

public class JavaArrayMaxSum {

	public static void main(String[] args) {
		// TODO Java Array Max Sum:
		int[] numbers= {78,22,-23,45,98,24,-56,65,77};
		/*
		 *  To find the max sum:
		 *  we need to declare a variable which will store the sum
		 *  Next we will keep on updating it until its value decreases 
		 *  Then we need to store this sum with another variable which will keep the sum value of prev iteration
		 *  and compare it in every iteration to update this second variable
		 *  AT LAST whatever value is there in this variable will be the MAX SUM.
		 */
		int sum=0, maxSum=0;
		
		//This program will give max sum in sub array with positive values only
				
		for(int w=0; w<numbers.length; w++) {
			if(sum+numbers[w]<= sum) {
				maxSum=sum;
				sum=0;
		}
			else
				sum += numbers[w];
				
		}
		System.out.println("Maximum sum in the subarray is:"+ maxSum);
		
		//The below code will give max sum considering all elements:
		maxSum=0;
		for(int i=0;i<numbers.length-i;i++) {
			sum=0; 
			for(int j=i;j<numbers.length;j++) {
				sum= sum+numbers[j];
			}
			if(sum>maxSum) maxSum=sum;
		}
		System.out.println("Max Sum in the array is: "+ maxSum);

	}

}
