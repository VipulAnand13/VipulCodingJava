package javaSorting;

public class UnionOfSortedArrays {
	//To find the union of the two sorted arrays
	
	static void unionOfSortedArrays(int[] a,int[] b) {
		int i=0;
		int j=0;
		int min= Math.min(a.length, b.length);
		//System.out.println(min);
				
		  while(i<a.length && j<b.length) {
						if(a[i]< b[j]) {
						    			if(i>0 && a[i]==a[i-1]) {
						    				i++;
						    				//System.out.print(" # ");
						    				continue;
						    			}
						    			//System.out.print(" & ");
						    			System.out.print(a[i] +  " " );
						       			i++;						    			
						   	 }
						    	
						else if(a[i]> b[j]) {
						    		if(j>0 && b[j]==b[j-1]) {
					    				j++;
					    				//System.out.print(" @ ");
					    				continue;
					    			}
					    			System.out.print(b[j]+  " " );
					       			j++;						    			
					         }
							
						else if(a[i]==b[j]) {
							    		System.out.print(a[i]+" ");
							    		i++;
							    		j++;
							    	 }
		    	             }
		  
		  // The above part of code is handling the case when i,j are within limits of both arrays and below part of function handles
		  // cases when one of the arrays are exhausted( reached final position) and other array has elements which is arr "a" in the eg.
		  
		  while(i<a.length || j<b.length){
				//System.out.println("I was here");
						if(a.length<= min)  {
							j= (a[j]==a[j-1])? j+1: j;
							System.out.print(b[j]+ " ");
							j++;
						  }
						
						else {
							if(b.length<= min) {
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
		int[] a= {1,2,2,3,5,7,9};
		int[] b= {2,3,3,4,8};
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
