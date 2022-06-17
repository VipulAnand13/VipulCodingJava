package JavaArray;

import java.util.Arrays;

public class JavaArrayTowersMinHeightDiff {

	public static void main(String[] args) {
		/*  Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing
         *  or decreasing them by K only once. After modifying, height should be a non-negative integer. 
         *  Find out the minimum possible difference of the height of shortest and longest towers after you have modified each tower.
         *  Note:Compulsory to modify each tower height.
		 */
		
		int[] towerHeight= {1, 5, 8, 10};
		int k=2;
		int n=towerHeight.length; 
		
		int minDiff=towersMinHeightDiff(towerHeight, k, n);
		System.out.println("The min diff between two towers after change is: "+ minDiff);
		
       
	}

	public static int towersMinHeightDiff(int[] arr, int k,int n) {
		int diff=0;
		Arrays.sort(arr);
		
		int i=0,j=n-1;
		while(i<j) {
			arr[i] += k;
			
			if(arr[j]-k>0) 	arr[j] -= k;
			else arr[j] =+k;
			
			++i;j--;
		}
		Arrays.sort(arr);
		
		diff= arr[n-1]-arr[0];
		return diff; 
			
	}
}
