 package JavaArray;

public class JavaArrayMaxEqual0s1sSubArray {

	public static void main(String[] args) {
		// TODO Search Biggest Sub-array with Equal 0s and 1s:
		
		/*
		 *  TO solve this problem:
		 *  1.brute- Force Approach: Iterate over the array and find max sub array size with 0s and 1s.
		 *  
		 */
		
		
         int[] myArray= {0,0,1,0,1,1,0,0,0,1,1};
         MaxSubArray(myArray);
         MaxSubArraydummy(myArray);
                  
	}
	
	public static void MaxSubArray(int[] binaryArray) {
		int count=0;
		//int tempstart=0;
		int start=0;
		int end=0;
		
		for(int i=0;i<binaryArray.length;i++) {
			//tempstart=i;
			count=0;
			
			for(int j=i;j<binaryArray.length;j++) {
			if(binaryArray[j]==0) count++;
			
			if(binaryArray[j]==1) count--;
			
			if(count==0 && j-i>end-start) {
				start=i;
				end=j;
			    }
		    }
			
			
		}	
		
		System.out.println("Start:"+start +"End:"+end);
	}
	
	public static void MaxSubArraydummy(int[] binaryArray) {
		int count=0;
		int tempstart=0;
		int start=0;
		int end=0;
		
		while(tempstart< binaryArray.length-1) {
		for(int j=tempstart;j<binaryArray.length;j++) {
						
			
			if(binaryArray[j]==0) count++;
			
			if(binaryArray[j]==1) count--;
			
			if(count==0 && j-tempstart>end-start) {
				start=tempstart;
				end=j;
			    }
					
		}	
		tempstart++;
		count=0;
		}
		
		System.out.println("Start:"+start +"End:"+end);
	}
}
