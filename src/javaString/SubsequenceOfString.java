package javaString;

public class SubsequenceOfString {
	
	// TO find whether a given string is a subsequence of another string or not
	
	static boolean subsequenceOfString(String str, String temp) {
		int index=0;
		for(int i=index; i<str.length(); i++) {
			if(index<=temp.length()-1 && str.charAt(i)==temp.charAt(index)) index++;
			
		}
		if(index==temp.length()) return true;
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subsequenceOfString("abcdefghi","bac"));
	}

}
