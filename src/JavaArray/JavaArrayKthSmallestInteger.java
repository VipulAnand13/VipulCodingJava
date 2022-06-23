package JavaArray;

//import java.util.Arrays;

public class JavaArrayKthSmallestInteger {

	public static void main(String[] args) {
		/*
		 * 1.Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest
		 *  element in the given array.
			It is given that all array elements are distinct.			
			Example 1:
			
			Input:
			N = 6
			arr[] = 7 10 4 3 20 15
			K = 3
			Output : 7
			Explanation :
			3rd smallest element in the given 
			array is 7.
			Your Task:
			You don't have to read input or print anything. Your task is to complete the function kthSmallest() which takes the array
			arr[],integers l and r denoting the starting and ending index of the array and an integer K as input 
			and returns the Kth smallest element.
			  
			Expected Time Complexity: O(n)
			Expected Auxiliary Space: O(log(n))
		 */
		
		int[] arr= {7,10, 4, 3, 20, 15};
		int k=3;
		int r=arr.length-1;
		int l=0;
		System.out.println(kthSmallestNumber(arr,l,r,k)); 

	}
	
	//The provided solution implements Quick select algo based on quick sort algo which works on one part of array and ignore other:
	
	/*
	 * There are three part of this solution:
	 * 1. KthSmallestNumber: this function acts as the recursive function which checks whether the pivot index or position is the kth smallest element 
	 *                       are looking for. Otherwise based on the pivot index, we either work on the left array or the right array.
	 *               
	 * 2.Pivot function: This function takes the array,starting index and last index and sort the part of array provided.
	 * 
	 * 3.Swap function: This helps in swapping the numbers when we want to sort the array in the Pivot function.
	 */
	
	  public static int kthSmallestNumber(int[] arr,int l,int r, int k) {
		  
		 // If element lies in the array:		 
		 if(k>0 && k<=r-l+1) {
			 
		 int pos= pivot(arr,l,r);
		 
		 if(k-1==pos-l) return arr[pos];
		 
		 else if(k-1<pos-l) return kthSmallestNumber(arr,l,pos-1,k);
		 
		 else  return kthSmallestNumber(arr,pos+1,r,k-pos+l-1);
		 }
		 
		 return -1;		 
	}
	
	  //Pivot function to sort the array part considered.
	static int pivot(int[] arr,int l, int r) {
		int pos;
		
		int last=arr[r];
		int i=l;
		for(int j=l;j<=r-1;j++) {
			if(arr[j]<=last) {
				swap(arr,i,j);
				i++;
				//System.out.println(Arrays.toString(arr));
			}
		}
		swap(arr,r,i);
		//System.out.println(Arrays.toString(arr));
		pos=i;
		//System.out.println(i);
		return pos;
	}
	
	static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
      
	
}
