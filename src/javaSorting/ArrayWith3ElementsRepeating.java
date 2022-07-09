package javaSorting;

public class ArrayWith3ElementsRepeating {
	// To sort an array having three repeating elements
	
	// Possible appraoch: 1.To solve the prob in two iterations, we can count the number of repetitions and in second iteration we can sort the array based on count.
	//                    2.Dutch Flag Rating Algo.
	
	//DUTCH FLAG RATING Algo: Consider three variables: low, mid and high 
	//With one element repetitions in the left of "low" variable ; second element being on the right of the "high" variable and third element being in the unknown region of mid variable
	//low and mid variables are started with 0 and high variable with last pos, now 
	// move the mid variable ahead till it reaches high variable, if element is 0, then swap element with low var pos and increase both low and mid var
	// if the element is 1, swap it with low var pos and increase only mid variable.
	// if element is 2, swap it with high variable pos and decrease the high var pos.	
	
	static void sort3RepeatingElements(int[] arr) {
		  int low=0;
		  int mid=0;
		  int high=arr.length-1;
		  
		  while(mid<high) {
			  if(arr[mid]==0) {
				  swap(arr,mid,low);
				  low++;
				  mid++;
//				  System.out.println("low "+ low);
//				  System.out.println("mid "+ mid);
				 // printArr(arr);
			  }
			  
			  else if(arr[mid]==1) 	  {
				  swap(arr,mid,low);				  
				  mid++;
//				  System.out.println("mid "+mid);
				 // printArr(arr);
			  }
			  
			  else if(arr[mid]==2) {
				  swap(arr, mid, high);
				  high--;				  
//				  System.out.println("mid "+mid);
//				  System.out.println("high "+ high);
				 // printArr(arr);
			  }
		  }
		  printArr(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,1,0,0,2,2,1,0,2,2,1,1,1,0,1};
		sort3RepeatingElements(a);
	}
	
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
