package javaString;

import java.util.Arrays;

public class Anagram {
	// To check if the two strings are ANAGRAMS: Anagrams are string which contains same and same numbers of Characters.
	// Eg.: CAT and ACT, SECURE and RESCUE
	
	//Possible sol: Use Hashmap
	//              use sorting and then compare the strings
	// If it is given that strings dont have repeated characters, we can iterate over one string and check if it is present in second.
	
	static boolean areAnagrams(String str1,String str2) {
	    char[] str1_arr= str1.toCharArray();	
	    char[] str2_arr= str2.toCharArray();
	    
	    Arrays.sort(str1_arr);
	    Arrays.sort(str2_arr);
	    
	    str1= new String(str1_arr);
	    //System.out.println(str1);
	    str2= new String(str2_arr);
	    //System.out.println(str2);
	    
	    if(str1.equals(str2)) return true;
	    
	    return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areAnagrams("CAT","ACT"));
	}

}
