package JavaArray;

import java.util.Arrays;

public class JavaArraySort0s1s2s {

	public static void main(String[] args) {
		// TODO Sort the array containing 0s ,1s and 2s.
		int[] myArray= {1,2,0,0,1,1,0,2};
		int n=myArray.length;
		System.out.println(Arrays.toString(sorted012(myArray,n)));

	}
	public static int[] sorted012(int[] arr,int n) {
		int zeroCount=0;
		int oneCount=0;
		
		for(int z: arr) {
			if(z==0) zeroCount++;
			
			else if(z==1) oneCount++;			
		}
		
		oneCount += zeroCount;
		
		for(int i=0;i<n;i++) {
		   if(i<zeroCount) arr[i]=0;
		   
		   else if(i>=zeroCount && i<oneCount) arr[i]=1;
		   
		   else arr[i]=2;
		}
		
		
		
		return arr;
	}

}
