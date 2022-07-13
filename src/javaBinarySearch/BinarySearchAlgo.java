package javaBinarySearch;

public class BinarySearchAlgo {
	
	static int binarySearchAlgo(int[] arr, int key) {
		int left= 0;
		int right=arr.length-1;
		while(left<= right) {
			int midIndex = (left+ right)/2;      // can use "midIndex= left + (right-left)/2 " in case of large integers to avoid integer overflow.
			if(arr[midIndex]==key) return midIndex;         // To check if mid element is the target
			if(key< arr[midIndex]) right= midIndex-1;		// to check if the target is in the left array
			else left=midIndex+1;							// else check if the target is in right array.
		}
		return -1;                							// In case target was not found in the array.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,5,7,8,9};
		
		System.out.println("The target search value is at index:  " +binarySearchAlgo(a, 11));
	}

}
