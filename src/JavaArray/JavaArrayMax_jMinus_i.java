package JavaArray;



public class JavaArrayMax_jMinus_i {

	public static void main(String[] args) {
		// TODO Given an array find max (j-i) such that array[j]>array[i]:
		
		int[] myArray= {3,4,5,1,7,2,6,5,4,1};
		System.out.println("The max j-i is:"+ maxJminusI(myArray));
	}
	
	static int maxJminusI(int[] arr) {
		int maxDiff=0;
		
		int n=arr.length;
		int[] leftMin=new int[n];
		int[] rightMax=new int[n];
		
		rightMax[n-1]=arr[n-1];
		for(int j=n-2;j>=0;j--) {
			rightMax[j]= Math.max(rightMax[j+1], arr[j]);
		}
		
		leftMin[0]=arr[0];
		for(int j=1;j<n;j++) {
			leftMin[j]= Math.min(leftMin[j-1], arr[j]);
		}
		
		int  i=0,j=0;
		
		while(i<n && j<n) {
			if(rightMax[j]>leftMin[i]) {
				maxDiff=Math.max(maxDiff, j-i);
				j++;
			}
			else
				i++;
		}
		
		return maxDiff;
	}
	
	
}
