package javaString;

import java.util.HashSet;
import java.util.Set;

public class LeftMostRepeatingChar {
	// To find the left most repeating character:
	
	// Brute Force Approach:
	static char leftMostRepeating(String str) {
		char left=' ';
		char[] hey= str.toCharArray();
		for(int i=0;i<hey.length;i++) {
			for(int j=i+1;j<hey.length;j++) {
				if(hey[j]==hey[i]) {
					left = hey[i];
				    break;
				}
				if(left != ' ') break;
			}
		}
		return left;
	}
	//________________________________________________________
	
	//Use SET to check the first repeating character from left:
	
	static char leftRepeatingChar(String str) {
		Set<Character> setChar = new HashSet<Character>();
		int i;
		for(i=0; i<str.length();i++) {
			if(setChar.contains(str.charAt(i))) {
				break;
			}
			else
				setChar.add(str.charAt(i));
		}
		return str.charAt(i);
	}
	
	//_________________________________________________________
	public static void main(String[] args) {
		
		//System.out.println(leftMostRepeating("Hapapy"));
		System.out.println(leftRepeatingChar("Heolo"));
	}

}
