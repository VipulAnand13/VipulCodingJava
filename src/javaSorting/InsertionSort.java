 package javaSorting;

public class InsertionSort {
	
	static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length;i++) {
			
			int j=i-1; 
			int temp=arr[i];
			
			for(;j>=0;j--) {
				
				if(temp<arr[j]) {
				    arr[j+1]=arr[j];
				}
				else 
				    break;
			}
			arr[j+1]= temp;
			printArr(arr);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my= {7,4,8,3,7,9,1};
		insertionSort(my);
		printArr(my);

	}
//  _______________________________________________________
	
	// Helper functions of swapping and printing array:
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
