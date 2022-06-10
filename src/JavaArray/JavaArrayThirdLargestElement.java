package JavaArray;

import java.text.MessageFormat;

public class JavaArrayThirdLargestElement {

	public static void main(String[] args) {
		// TODO 3rd largest element in array:
		
		int[] score= {};
		        
        if(score.length<3) System.out.println("Third largest can't be defined");
        
        else {
        	int largest = score[0];
            int secondLargest= score[0];
            int thirdLargest=score[0];
            
            for(int w: score) {
        	
            	if(w> largest) {
        		thirdLargest=secondLargest;
        		secondLargest=largest;
        		largest=w;
        	    }
        	
            	else if(w <largest && w> secondLargest) {
        		thirdLargest=secondLargest;
        		secondLargest=w;
        		}
        	
            	else if(w< secondLargest && w>thirdLargest) {
        		thirdLargest=w;        		
        		}
            }
        		System.out.println(MessageFormat.format(" Largest number: {0} \n Second Largest number:{1} \n Third Largest number:{2}",largest,secondLargest,thirdLargest));   
         }
   }
        

}
