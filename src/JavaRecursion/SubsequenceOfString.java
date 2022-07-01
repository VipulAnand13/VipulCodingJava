package JavaRecursion;

import java.util.HashSet;
//import java.util.Set;

public class SubsequenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="abc";
		
		subSequenceOfString(str);
		
	    
	}
	
	
	public static void subSequenceOfString(String str) {
		HashSet<String> hs= new HashSet<>();
	       
		genSequenceOfString(str,0,"",hs);
		
		for(String s:hs) System.out.println(s);
	}
	
	public static void genSequenceOfString(String str,int j,String str1,HashSet<String> set) {
		if(j==str.length()) {
			set.add(str1);
			return;			
		}
		
		genSequenceOfString(str,j+1,str1,set);
		genSequenceOfString(str,j+1,str1+str.charAt(j),set);
	}

}
