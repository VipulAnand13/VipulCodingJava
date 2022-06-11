package JavaArray;

import java.util.Arrays;

public class JavaArrayOperations {

	public static void main(String[] args) {
		/* TODO 1.Creating an array  
     		2.Delete an element from the array
     		3.Find largest number in array
     		4.Find second largest number in array
     		5.Remove duplicates from an array
     		6.Remove duplicates from a sorted array 
     		
     		    		Access Token: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
         */
	
		//1.Creating an array has 2 ways: array "numbers" of length 10 and array marks
		int[] numbers= new int[10];
		System.out.println(numbers.length);
		int[] marks= {34,56,65,77,66,34,89,32,67};
		
		//2.Deleting an element from the array
		int deleteElement=89;
		int key=0;
		for(int z:marks ) {
			key++;
			if(z==deleteElement) break;
		}
		System.out.println(key);
		for(int i=key-1;i<marks.length-1;i++) {
			marks[i]=marks[i+1];
		}
		
		System.out.println(Arrays.toString(marks));
		
		//3.Find largest number in array
		int largest=0;
		for(int w : marks) {
			if(w>largest) largest=w;
		}
		 System.out.println(largest);
		 
		//4.Second largest element in the array:
		 int secondLargest=0;
		 for(int w: marks) {
			 if(w>largest) {
				 secondLargest=largest;
				 largest=w;
			}
			 else if(w<largest && w>secondLargest) secondLargest=w;
		 }
		 System.out.println(" Largest:"+ largest+"\n Second Largest:"+secondLargest);
		 
		 //5.Remove duplicates from array:
		 
		 for(int a=0;a<marks.length-1;a++) {
			
			 for(int b=a+1;b<marks.length;b++) {
				 
				 if(marks[b]==marks[a]) {
					 if(b==marks.length-1)
						 marks[b]=0;
					 else
						 marks[b]=marks[b+1];
				 }
			 }
		 }
		 System.out.println(Arrays.toString(marks));
		 
		
	}

}
