package JavaArray;

import java.util.Arrays;

public class JavaArrayRandomOuputPattern {

	public static void main(String[] args) {
		// TODO to replace every element with the greatest number on the right side
		
		//int[] arrayRandom= {5,8,7,9,2,6,7,4,2};
		int[] arrayRandom= {7,5,8,9,6,8,5,7,4,6};
		int n=arrayRandom.length;
		
		
		//Method1: This is the Brute-Force approach done in time complexity O(n^2)   Note: one zero was there in requirement in ques at lat place
		for(int i=0;i<n;i++) {
			if(i==n-1) arrayRandom[i]=0;
			
			else {
				int largest=0;
				for(int j=i+1;j<n;j++) {
					if(arrayRandom[j]> largest) largest=arrayRandom[j];
				}
				arrayRandom[i]=largest;
			}
			
		}
		System.out.println(Arrays.toString(arrayRandom));
		
		//Method 2: Reverse check of largest number(LEADER approach) -- Optimised Code done in time complexity O(n):
		
		int[] arrayRandom1= {7,5,8,9,6,8,5,7,4,6};
		int largest=0;
		for(int i=n-1;i>=0;i--) {
			if(arrayRandom1[i]> largest) largest=arrayRandom1[i];
			
			else arrayRandom1[i]=largest;			
		}
		System.out.println(Arrays.toString(arrayRandom1));
	}

}
