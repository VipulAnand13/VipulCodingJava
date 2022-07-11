package javaSorting;

import java.util.Arrays;

public class MinDiffInArray {
	static int minDiffinArray(int[] arr) {
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++) {
			min= Math.min(min, arr[i]-arr[i-1]);
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,37,25,15,9,79};
		System.out.println(minDiffinArray(arr));
	}

}
