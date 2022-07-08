package javaString;

import java.util.HashSet;
import java.util.Set;


public class LongestDistinctSubstring {
	// To find out the longest distinct substring in a given string:

	// __________________________________________________________________________________
	// To find the length of the longest distinct Substring in a String:
	static int longestDistinct(String str, String res) {
		//char[] ch= new char[str.length()];
		
		Set<Character> checklongest = new HashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			//int end=0;
			
			if(checklongest.contains(str.charAt(i)) || i==str.length()-1) {
				if(checklongest.size()> res.length()) {
					res="";
					for(char e: checklongest)	res += e;
				    checklongest.clear();
				}
			}
			
			if(!(checklongest.contains(str.charAt(i)))) checklongest.add(str.charAt(i)); 
//			System.out.println(checklongest);
//			System.out.println(checklongest.size());
//			System.out.println(res.length());
//			System.out.println(res);
					
		}
		
		
	    return res.length();	
	}

	//_______________________________________________________________________________________
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<Character> checklongest = new HashSet<Character>();
//		checklongest.add('e');
//		checklongest.add('g');
//		String s=checklongest.toString();
//		System.out.println(s);
		
		String res="";
		System.out.println(longestDistinct("helloMrVipul",res));
		System.out.println(res);
		
	}

}
