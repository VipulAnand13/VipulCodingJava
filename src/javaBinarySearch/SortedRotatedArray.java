package javaBinarySearch;

public class SortedRotatedArray {
	
	static int pivotElement(int[] arr) {
		int l=0;
		int r=arr.length-1;
		
		while(l<=r) {
			int mid= l +(r-l)/2;
			if(arr[mid]< arr[0]) {
				if(arr[mid-1]<arr[0])
					r=mid-1;
				else
					return mid;
			}
			
			else l++;	
			 
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr,int key, int left,int right) {
				
		while(left<= right) {
			int mid= left + (right-left)/2;
			if(arr[mid]==key) return mid;
						
			else if(arr[mid]>key)	right= mid-1;
						
			else left= mid+1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,8,1,2,3,4,5,6};
		int key=2;
		int pivot=pivotElement(arr);
		//System.out.println(pivot);
		
		if(pivot>0) {
		int a=	binarySearch(arr, key, 0, pivot-1);
		int b=	binarySearch(arr, key, pivot, arr.length-1);
		
		System.out.println(Math.max(a, b));
		}
		
		else
			System.out.println(binarySearch(arr, key, 0, arr.length-1));
	}

}
