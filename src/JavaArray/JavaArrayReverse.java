package JavaArray;

import java.util.Arrays;

public class JavaArrayReverse {

	public static void main(String[] args) {
		// TODO Reverse given array:
		int[] numbers= {3,6,9,4,5,2,8};
		int n=numbers.length;
		int temp=0;
		
		for(int i=0;i<n/2;i++) {
			
			temp=numbers[i];
			numbers[i]=numbers[n-1-i];
			numbers[n-1-i]=temp;
		}
		System.out.println(Arrays.toString(numbers));

	}

}
