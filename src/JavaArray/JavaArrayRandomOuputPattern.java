package JavaArray;

import java.util.Arrays;

public class JavaArrayRandomOuputPattern {

	public static void main(String[] args) {
		// TODO to replace every element with the greatest number on the right side
		
		//int[] arrayRandom= {5,8,7,9,2,6,7,4,2};
		int[] arrayRandom= {7,5,8,9,6,8,5,7,4,6};
		int n=arrayRandom.length;
		
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
	}

}
