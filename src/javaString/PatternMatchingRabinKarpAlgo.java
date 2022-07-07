package javaString;

public class PatternMatchingRabinKarpAlgo {
	// To do the string pattern matching within a string
	
	// Approach: 1. Normal approach to iterate over the string and find the pattern.
   //			 2. Rabin Karp Algo
//_____________________________________________________________________________________
	
	//1.NORMAL APPROACH:       TC: O(n*m)
	static boolean patternMatching(String str,String ptr) {
		for(int i=0;i<str.length()-ptr.length();i++) {
			int j;
			for(j=0; j<ptr.length();j++) {
				if(str.charAt(i+j)!=ptr.charAt(j)) break;
			}
			
			if(j==ptr.length()) return true;
		}
		return false;
	}
	
// __________________________________________________________________________________________
	// In this piece of code, we are doing hash function call for all the iterations where we are sliding the window of pattern
	
//	static boolean patternMatchingAlgo(String str, String ptr) {
//		char[] st= str.toCharArray(); 
//		int hash=0;
//		for(int i=0; i<ptr.length();i++ )   hash += ptr.charAt(i);
//		//System.out.println(hash);
//		int n=ptr.length()-1;
//		
//		for(int j=0;j<str.length()-n;j++) {
//			int res=hashFunction(st, j, j+n);    // This is where we are calling hash function for each iteration.
//			System.out.println(res);
//			if(res==hash) {
//				int k;
//				for(k=0;k<=n;k++) {  if(str.charAt(j+k)!=ptr.charAt(k)) break;
//				}
//				
//				if(k==ptr.length()) return true;
//			}
//		}
//		return false;
//	}	
	
// _________________________________________________________________________________________
	//2. RABIN KARP ALGO:        TC:O(n+m) in avg case 
	
	static boolean patternMatchingAlgo(String str, String ptr) {
		char[] st= str.toCharArray(); 
		int hash=0;
		for(int i=0; i<ptr.length();i++ )   hash += ptr.charAt(i);
		//System.out.println(hash);
		int n=ptr.length()-1;
		
		int res=hashFunction(st, 0, n);     // In Rabin Karp Algo, the function is called once and prev value is subtracted and next value is added in each iteration
		for(int j=1;j<=str.length()-n;j++) {
			//System.out.println(res);
			if(res==hash) {
				int k;
				for(k=0;k<=n;k++) {  if(str.charAt(j+k-1)!=ptr.charAt(k)) {
					//System.out.println(str.charAt(j+k)); System.out.println(ptr.charAt(k));
				    break;
				    }
				}
				
				if(k==ptr.length()) return true;
			}
			
			if(j<str.length()-n) {
			res -= st[j-1];
			//System.out.println(res);
			res += st[j+n];
			//System.out.println(res);
			}
		}
		return false;
	}	
	
	
	static int hashFunction(char[] ch, int i, int j) {
		int hash=0;
		for(int p=i; p<=j;p++) {
			hash += ch[p];
		}
		return hash;
	}
//  _________________________________________________________________________________________ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(patternMatching("abcdefghijkl","ghi"));
		System.out.println(patternMatchingAlgo("abcdefghijkl","jkl"));
	}

}
