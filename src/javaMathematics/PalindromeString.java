package javaMathematics;

public class PalindromeString {
	//To check if the given string is a Palindrome.
	
	public static boolean checkPalindrome(String str) {
		int i=0;
		int n=str.length()-1;
		while(i<n-i){
			if(str.charAt(i)!= str.charAt(n-i)) return false;
			i++;
		}
		return true;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("ABCDCBA"));
	}

}
