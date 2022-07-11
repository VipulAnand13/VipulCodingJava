package javaSorting;

public class ArrayWith2ElementsRepeating {

	public static void sort2RepeatingElements(int[] arr) {
		int low=0;
		int high=arr.length-1;
		
		while(low<high) {
			if(arr[low]==0) {
				swap(arr,low,low);
				low++;
			}
			else if(arr[low]==1) {
				swap(arr,low,high);
				high--;
			}
		}
		printArr(arr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr= {1,0,0,1,1,0,1,0,0,1,0};
		sort2RepeatingElements(myarr);
	}

	//_____________________HELPER FUNCTION__________________________________
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
