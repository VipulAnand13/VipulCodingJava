 package javaString;

public class lengthOfLastWord {
	//TO find the length of the last word in the string
	
	// Logic: to find the last space break and to take the count of characters after that.
	public static int lastWordLength(String str) {
		int count=0;
		int i;
		for(i=count; i<str.length();i++) {
			if(str.charAt(i)==' ') count=i+1;
		}
		
		return str.length()-count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lastWordLength("I am the next champion"));

	}

}
