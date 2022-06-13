package JavaArray;

import java.util.Arrays;

public class JavaArray0sAtEndPattern {

	public static void main(String[] args) {
		// TODO Move all 0s to the end of the array:
		
		int[] number= {8,0,1,3,0,0,5};
		int[] numbershifted=move0sAtTheEnd(number);
		System.out.println(Arrays.toString(move0sToEnd(number)));
		System.out.println(Arrays.toString(numbershifted));
		

	}
	
	
	 //Method1: This solution is only valid if our requirement is to get all )s at end and other elements order don't matter.
	/*
	 * A clone array is created so that we don't interfere or change the original array
	 */
	static int[] move0sToEnd(int[] numbers) {
		int[] numbersclone= numbers.clone();
		int count=0;
		Arrays.sort(numbersclone);
		int i=0;
		while (numbersclone[i]==0) {
			count++;
			i++;
		}
		
		for(int q=0; q<count;q++) {
			int firstElement=numbersclone[0];
			int p;
			for( p=0;p<numbersclone.length-1;p++) {
				numbersclone[p]=numbersclone[p+1];
			}
			numbersclone[p]=firstElement;
		}
		
		return numbersclone;		
	}
	
	//Method2: To print the Series of numbers in the original order and moving Zeros to the end.
	static int[] move0sAtTheEnd(int[] arr) {
	
	for(int y=0;y<arr.length-1;y++) {
	     
		if(arr[y]==0 && arr[y+1]!=0) {
			int temp=arr[y];
			int z;
			for(z=y;z<arr.length-1;z++) {
				arr[z]=arr[z+1];
				}
			arr[z]=temp;
		}
		
		
		else if(arr[y]==0 && arr[y+1]==0) {
			int temp1=arr[y];
			int temp2=arr[y+1];
			int z;
			for(z=y;z<arr.length-2;z++) {
				arr[z]=arr[z+2];
			  }
			arr[z]=temp1;
			arr[z+1]=temp2;
		    }
	      }
	
	    return arr;
     }
}
