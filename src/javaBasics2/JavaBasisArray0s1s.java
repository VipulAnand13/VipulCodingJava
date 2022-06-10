package javaBasics2;

import java.util.Arrays;

public class JavaBasisArray0s1s {

	public static void main(String[] args) {
		// TODO Separate the 0s and 1s in the Array
		int[] binaryArray= {0,1,0,0,1,1,1,1,0,1,1,0};
		
		int totalcount= binaryArray.length;
		for(int x:binaryArray) {
			if(x==1) 
				totalcount-- ;
				}
		int[] separatedArray= new int[binaryArray.length];
		
		/*in array conditions either
		 * put    x<array.length
		 * or
		 * use    x<=array.length-1
		 */
		for(int x=0; x<=binaryArray.length-1 ;x++) {      
			if(x<totalcount)  
				separatedArray[x]=0;
			else
				separatedArray[x]=1;
		}
		//Arrays.toString(arrayName) can be used to print an Array directly without loop
		System.out.println(Arrays.toString(separatedArray));
	}

}
