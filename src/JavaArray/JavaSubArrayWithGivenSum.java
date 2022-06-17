package JavaArray;

//{ Driver Code Starts
	import java.util.*;
	import java.lang.*;
	import java.io.*;
	

public class JavaSubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          	
//	     Scanner sc = new Scanner(System.in);
//
//	    int t = sc.nextInt();
//
//	    for (int i = 0; i < t; i++) {
//	            int n = sc.nextInt();
//	            int s = sc.nextInt();
//
//	            int[] m = new int[n];
//	            for (int j = 0; j < n; j++) {
//	                m[j] = sc.nextInt();
//	            }
		       int[] m= {6,2,4,7,7,5};
		       int n=m.length;
		       int s=5;
	            
	            //Solution obj = new Solution();
	            ArrayList<Integer> res = subarraySum(m, n, s);
	            for(int ii = 0;ii<res.size();ii++)
	                System.out.print(res.get(ii) + " ");
	            System.out.println();
	        
	    

	        // } Driver Code Ends
   
	}
	
	
	 //Function to find a continuous sub-array which adds up to a given number.
	  public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	        ArrayList<Integer> pos= new ArrayList<Integer>();
	        int start=0;
	        int sum;
	        int count=0;
	        while(start<n){
	        	sum=0;
	        	
	        for(int i=start;i<n;i++){
	            sum += arr[i];
	            
	            if(sum==s) {
	            pos.add(start+1);
	            pos.add(i+1);
	            count++;
	            break;
	            }
	            
	            else if(sum>s) {
	                start++;
	                break;
	            }   
	            
	            else if(sum<s && i==n-1) start++;
	            
	        }
	        if(count >0 || start==n) break;
	    }
	     if(count == 0) pos.add(-1);
	    
	     return pos;
	 }

 }

