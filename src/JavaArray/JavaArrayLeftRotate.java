package JavaArray;

import java.util.Arrays;

public class JavaArrayLeftRotate {

	public static void main(String[] args) {
		// TODO Rotate an array in left direction by Key times:
		
		int[] number= {2,7,9,5,6,1,8};
		int key=3;
		System.out.println("Before Rotation:" + Arrays.toString(number));
		
		rotateArrayLeftKeyTimes(number,key);
		System.out.println(Arrays.toString(number));
		
		System.out.println(Arrays.toString(rotationOfArray(number,key)));

	}
	public static int[] rotateArrayLeftKeyTimes(int [] numbers,int key) {
		for(int i=0; i<key;i++) {
			/* We store the starting value at temp variable as once we start rotation the next element will move into it and we will lose
			 * the initial value which we need to store at the last index.
			 * First loop takes care of the number of times we want to rotate left and the second loop takes care of rotating the elements.
			 */
			 
			int temp=numbers[0];
			for(int j=0;j<numbers.length-1;j++) {
				numbers[j]=numbers[j+1];
			}
			numbers[numbers.length-1]=temp;
		}
		
		
		return numbers;
	}
	
	// Optimized Approach: Reverse the array elements till kth element then reverse the remaining elements and at last reverse entire array.
	
	//  Reverse(0,k-1) --> Reverse(k,n-1) --> Reverse(0,n-1) : 3 step process to rotate any array by k times.
	public static int[] rotationOfArray(int[] arr, int k) {
		int n=arr.length;
		int j;
		int temp=0;
		for(j=0; j<k/2;j++) {
			temp=arr[j];
			arr[j]=arr[k-1-j];
			arr[k-1-j]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	
		for(j=0; j<(n-k)/2;j++) {
			temp=arr[j+k];
			arr[j+k]=arr[n-1-j];
			arr[n-1-j]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(j=0; j<n/2;j++) {
			temp=arr[j];
			arr[j]=arr[n-1-j];
			arr[n-1-j]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		return arr;
	}

}
