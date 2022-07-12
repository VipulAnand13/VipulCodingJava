package javaSorting;

public class UnionOfSortedArrays {
	//To find the union of the two sorted arrays
	
	static void unionOfSortedArrays(int[] a,int[] b) {
		int i=0;
		int j=0;
		int min= Math.min(a.length, b.length);
		//System.out.println(min);
				
		  while(i<a.length && j<b.length) {                             // to iterate within two arrays
						if(a[i]< b[j]) {								// to check if ith element if a is less than jth element of b 
						    			if(i>0 && a[i]==a[i-1]) {		// to check if prev element of a is same as current element of a
						    				i++;
						    				//System.out.print(" # ");
						    				continue;
						    			}
						    			//System.out.print(" & ");
						    			System.out.print(a[i] +  " " );  // to print the element of array a
						       			i++;						    			
						   	 }
						    	
						else if(a[i]> b[j]) {							// to check if ith element if a is greater than jth element of b
						    		if(j>0 && b[j]==b[j-1]) {			// to check if prev element of b is same as current element of b
					    				j++;
					    				//System.out.print(" @ ");
					    				continue;
					    			}
					    			System.out.print(b[j]+  " " );		 // to print the element of array b
					       			j++;						    			
					         }
							
						else if(a[i]==b[j]) {							// to check if ith element if a is equal than jth element of b
							    		System.out.print(a[i]+" ");		// to print any element either of a or b(as both are same)
							    		i++;
							    		j++;
							    	 }
		    	             }
		  
		  // The above part of code is handling the case when i,j are within limits of both arrays and below part of function handles
		  // cases when one of the arrays are exhausted( reached final position) and other array has elements which is arr "a" in the eg.
		  
		  while(i<a.length || j<b.length){							// To iterate over the other array ehich is not exhausted
				//System.out.println("I was here");
						if(a.length<= min)  {						// to check if a is exhausted or not
							j= (b[j]==b[j-1])? j+1: j;              // now iterating over array b and also check duplicates in remaining b array
							System.out.print(b[j]+ " ");
							j++;
						  }
						
						else {
							if(b.length<= min) {					// to check if b is exhausted or not
								i= (a[i]==a[i-1])? i+1: i;
								System.out.print(a[i]+" ");
								i++;
						        }
					         }
			         }
		System.out.println();
		//System.out.println(i +" "+ j);
	}
	
	//_______________________________________________________________________
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,2,3,5};
		int[] b= {2,3,3,4};
		unionOfSortedArrays(a,b);
	}
	
	//_________________________________________________________________

	static void printArr(int[] a) {
		for(int e: a) {
			System.out.print(e+" ");			
		}
		System.out.println();
	}
}
