package JavaArray;

public class JavaArrayPeakElement {
	
	
	//Brute-Force approach to find the peak element: 
	public static int peakElement(int[] arr) {
		int peak=-1;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(i==0) {
				if(arr[1]<arr[0])
				peak=Math.max(peak, arr[0]);				
			}
			
			else if(i==n-1) {
				if(arr[n-1]>arr[n-2])
					peak=Math.max(peak, arr[n-1]);
			}
			
			else {
				if(arr[i]> arr[i-1] && arr[i]>arr[i+1]) 	
				    peak=Math.max(peak, arr[i]);
			}
		}
		return peak;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int[] mark= {2,5,3,9,6,7};	
	   System.out.println(peakElement(mark));
	}

}
