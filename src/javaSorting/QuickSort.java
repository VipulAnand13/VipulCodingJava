package javaSorting;

public class QuickSort {
	//In Quick Sort algorithm, we perform two pointer operation and choose a pivot element which checks if the left pointer has an 
	// element smaller than pivot element and the right pointer has an element greater than pivot element.
	// If we find any false condition while iterating the array, we swap the elements where i and j went false.
	// We perform this operation till i<j ie. left pointer is less than right pointer..
	// At last we swap the right pointer(j) element with the pivot element which ensures all elements to the left of this pivot is smaller
	// and all elements to the right of this pivot element is greater than pivot element.

	static int partitionSort(int[] arr, int pivot, int last) {
		// TODO Auto-generated method stub
		int i=pivot;
		int j=last;
		while(i<=j) {
			while(arr[i]<=arr[pivot]) i++;
			
			while(arr[j]>arr[pivot]) j--;
			
			if(i<j) {
			swap(arr,i,j);	
			//print(arr);
			i++;
			j--;
			}
			
		}
		swap(arr,j,pivot);
		//print(arr);
		return j;
	}

	
	static void quickSort(int[]arr,int pivot, int last) {
		
		int a=partitionSort(arr,pivot,last);
		
		if(a<=pivot || a>=last) return ; 
		
		
		quickSort(arr,pivot,a-1);
		quickSort(arr,a+1,last);
		
		
		
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,4,9,1,3,8,2,5};
		int pivot=0;
		int last=arr.length-1;
		quickSort(arr,pivot,last);
		print(arr);
	}

	//_______________________Helper Function______________________________
	static void swap(int[] arr, int a , int b) {
		int temp= arr[a];
		arr[a]= arr[b];
		arr[b]= temp;
	}
	
	static void print(int[] arr) {
		for(int e: arr)
			System.out.print(e +" ");
			System.out.println();
	}
	
}
