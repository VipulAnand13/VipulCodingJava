package javaSorting;

public class SelectionSort {
	//In selection sort, we iterate over the array and pick the min value in the array and place in the left most positions.
	//             In next iteration, we start from the second element of the array from the left as left most is sorted and apply same.
	
	static void selectionSort(int[] arr) {
	for(int i=0; i<arr.length;i++) {
		int min=arr[i];
		int minIndex=i;
		int j;
		printArr(arr);
		for(j=i;j<arr.length;j++) {
			if(arr[j]<min) {
				min=arr[j];
				minIndex=j;
			}
		 }
		swap(arr,i,minIndex);
	   }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my= {7,4,8,3,7,9,1};
		selectionSort(my);
		printArr(my);
	}
	
// _________________ HELPER FUNCTIONS___________________________
	
	static void swap(int arr[],int a, int b) {
		int temp= arr[a];
		arr[a]= arr[b];
		arr[b]= temp;
	}
	
	static void printArr(int[] a) {
		for(int e: a) {
			System.out.print(e+" ");			
		}
		System.out.println();
	}
	
}
