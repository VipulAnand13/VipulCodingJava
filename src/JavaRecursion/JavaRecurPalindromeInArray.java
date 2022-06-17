package JavaRecursion;

public class JavaRecurPalindromeInArray {

	public static void main(String[] args) {
		// TODO Check if an array is a Palindrome or not using recursion
        int[] arr= {2,3,4,4,8,2};
        int i=0; int n=arr.length;
        System.out.println(palindromeInArray(arr, i,n));
	}
	
	public static boolean palindromeInArray(int[] arr,int i,int n) {
		boolean pal=false;
		
		while(i<n) {
			pal=false;
			
		    if(arr[i]==arr[n-1]) {
		    	
		    	pal=true;	
		    	if(pal==true) palindromeInArray(arr, i+1, n-1);
		    	++i; n--;
		    }
		    else break;
		}
		return pal;
	}
}
