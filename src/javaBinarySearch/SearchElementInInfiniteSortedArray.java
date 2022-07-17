package javaBinarySearch;

public class SearchElementInInfiniteSortedArray {
	
	public static int searchInInfiniteSortedArray(int[] arr, int key) {
		int n= arr.length;
		if(n==0 && arr[n]== key) return 0;
		
		int index=1;
		while(key>arr[index]) index = index*2;  // Increasing the range of window to find out the array within which element lies.
		// index is doubled if required array window is not fetched, if we have 17 elements in array and we want to search 17th element
		// then till index 16 we didn't find out the element and then index is doubled and checks if arr[index] > key but only 17 elements
		// are there in array and hence will throw out of bound error. So we can check up to all the elements if the total elements are in
		// 2^n like 2,4,8,16,32... otherwise if we have 17 elements then we can search up to 16 elements which will be index/2.
		
		if(arr[index]>= key) {                   
			return binarySearchAlgo(arr, key, index/2, index);
		}
			
		return -2;
	}

	// __________________________________BINARY SEARCH____________________________________________________
	
	static int binarySearchAlgo(int[] arr, int key, int left, int right) {
		
		while(left<= right) {
			int midIndex = (left+ right)/2;                 // can use "midIndex= left + (right-left)/2 " in case of large integers to avoid integer overflow.
			if(arr[midIndex]==key) return midIndex;         // To check if mid element is the target
			if(key< arr[midIndex]) right= midIndex-1;		// to check if the target is in the left array
			else left=midIndex+1;							// else check if the target is in right array.
		}
		return -1;                							// In case target was not found in the array.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,6,7,9,11,14,17,18,21,23,25,27,28,31,34,36};
		int key=34;
		System.out.println(searchInInfiniteSortedArray(arr,key));
	}

}
