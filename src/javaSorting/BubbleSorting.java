package javaSorting;

public class BubbleSorting {
	
//	static void bubbleSort(int[] arr) {
//		for(int i=0; i<arr.length-1;i++) {
//			for(int j=i+1; j<arr.length;j++) {
//				if(arr[j]<arr[i])
//					swap(arr,i,j);
//							
//				printArr(arr);
//			}
//		}
//	}
	

// In this way of bubble sort implementation: after every iteration,the largest element of the array will be at last pos(Sorted from backwards)
	static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			boolean isSwapped=false;   
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					isSwapped=true;
				    swap(arr,j,j+1);
				    }							
			}			
			printArr(arr);
			if(!isSwapped) break;
		}
		 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my= {7,4,8,3,7,9,1};
		bubbleSort(my);
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
