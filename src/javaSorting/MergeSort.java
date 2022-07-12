package javaSorting;

public class MergeSort {
	
	static void mergeSort(int[] arr, int start, int last) {
		
		
		if(start<last) {																//while(start<last) {	
			int mid= (start+last)/2;													//		int mid= (start+last)/2;
			mergeSort(arr,start,mid);													//      mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,last);													//      mergeSort(arr,mid+1,last);
			merge(arr,start,mid,last);												    //      merge(arr,start,mid,last);
			//start++;																	//      start++;
			//last--;																	    //      last--;
		}																			   //   }
		
	}

	static void merge(int[] arr, int start, int mid, int last) {
		// TODO Auto-generated method stub
		 int[] b= new int[arr.length];
		 int i=start;
		 int j=mid+1;
		 int k=start;
		 
		 while(i<=mid && j<=last) {
			 if(arr[i]<arr[j]) {
				 b[k]=arr[i];
				 k++; i++;
			 }
			 else {
				 b[k]=arr[j];
				 k++;
				 j++;
			 }
		 }
		 
		 if(i>mid) {
			 while(j<=last) {
				 b[k]=arr[j];
				 k++; j++;
			 }
		 }
		 else {
			 while(i<=mid) {
				 b[k]=arr[i];
				 k++; i++;
			 }
		 }
		 
		 for(int w=start;w<=last;w++) {
			 arr[w]= b[w];
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,4,9,1,4,6,12,3,8,2,5};
		int pivot=0;
		int last=arr.length-1;
		mergeSort(arr,pivot,last);
		print(arr);
	}
	
	static void print(int[] arr) {
		for(int e: arr)
			System.out.print(e +" ");
			System.out.println();
	}

}
