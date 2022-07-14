package javaBinarySearch;

public class LastOccurrence {

	static int rightMostOccurrence(int[] arr, int key) {
		int leftIndex=0;
		int rightIndex=arr.length-1;
		
		while(leftIndex<= rightIndex) {
			int mid= leftIndex +(rightIndex-leftIndex)/2;
			
			if(arr[mid]==key) {
				if(arr[mid+1]==key)
					leftIndex=mid-1;
				else 
					return mid;
			}
			
			else if(key<arr[mid]) rightIndex=mid-1;
			
			else leftIndex=mid+1;
				
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,3,3,4,4,4,5,7,9};
		
		System.out.println(rightMostOccurrence( arr, 4));
	}
}
