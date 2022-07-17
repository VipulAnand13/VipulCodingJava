package javaBinarySearch;

public class MedianOfTwoSortedArrays {
	// TO find the median of Two SOrted arrays:
	// Approach: 1. Create an array nd merge both arrays in sorted manner and find out the median of this array.  TC:O(m+n)  SC:O(m+n)
	// To reduce it to TC: Log(n)  SC:O(1)
	// Optimized Approach: Dividing the two arrays into two  buckets such that all elements of left bucket is less than right bucket elements.
	// Find out the four variables max of both arrays in left bucket and min of both arrays in right bucket.
	
	// In the optimized approach, we need to apply binary Search on first array which is smaller in size.
	static double medianOfSortedArrays(int[] a, int[] b) {
		int n1=a.length;
		int n2=b.length;
		if(n1> n2) return medianOfSortedArrays(b,a);
		int l=0; int r=n1;
		while(l<=r) {
			int mid1= (l+r)/2;
			int mid2= (n1+n2+1)/2 - mid1;
			
			// max variables is for left bucket and min variables for right bucket
			int max1= mid1==0 ? Integer.MIN_VALUE:a[mid1-1];
			int max2= mid2==0 ? Integer.MIN_VALUE:b[mid2-1];
			
			int min1= mid1==n1 ? Integer.MAX_VALUE:a[mid1];
			int min2= mid2==n2 ? Integer.MAX_VALUE:b[mid2];
			
			if(max1<=min2 && max2<=min1) {
				if((n1+n2)%2==0)
					return ((double)(Math.max(max1, max2)+ Math.min(min1, min2)))/2;
				else
					return (double)(Math.max(max1, max2));
			}
			else if(max2>min1) l=mid1+1;
			
			else
				r=mid1-1;
		}
		return 0.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a= {1,2,3,4,5};
//		int[] b= {2,3,3,5,7,8,9};
////		// {1,2,2,3,3,3,4,5,5,7,8,9}
		
		int[] a= {1,3,4,5,6,7};
		int[] b= {5,7,8,9,11,12,15};
		// {1,3,4,5,5,6,7,7,8,9,11,12,15}
		System.out.println(medianOfSortedArrays(a, b));
	}

}
