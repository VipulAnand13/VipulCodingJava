package javaString;

public class ReverseWordsInString {
	// TO Reverse the words present in the sentence of String
	
	//Approach: 1. Split the string and iterate backwards
	// 			2. HashMap
	//			3. using stack
	//			4. Char Array
	
//  _____________________________________________________________________________	
	// Using Split method:
	
//	static String reverseTheSentence(String str,String rev) {
//		 
//		 String[] reverseArray= str.split(" ");
//		 for(int s=reverseArray.length-1;s>=0;s--) {
//			 rev += reverseArray[s]+" ";
//		 }
//		 return rev;
//	}
	
//  __________________________________________________________________________________
	// using char Array:  Logic is to first reverse each word one by one and then reverse the complete sentence string.
	
	static String reverseSentence(String str) {
		 
		 int start=0;
		 char[] tempstr = str.toCharArray();
		 for(int next=start;next<= str.length()-1;next++) {
			 if(str.charAt(next) ==' ') {                   // or we can use tempstr[next]==' ' 
				 reverseString(tempstr, start, next-1);     // Whenever we encounter a blank space, take note of index of start and end of word and reverse it.
				 start=next+1;				                // update the start index with the index next after the space which is starting of new word.
			}
						 		 
		 }
		 reverseString(tempstr,start,str.length()-1);   // TO reverse the last word as no ' ' space is there after last word.
		 
		 reverseString(tempstr,0,str.length()-1);       // To reverse the complete sentence.
		 return new String(tempstr);
	}

	
	static char[] reverseString(char[] str, int i, int j) {
				
		while(i<j) {
			char tempStr=str[i];
			str[i]= str[j];
			str[j]= tempStr;
			i++;
			j--;
			
		}
		return str;
	}
	
//  ___________________________________________________________________________________________	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "My name is Vipul";
		String rev="";
		System.out.println(reverseSentence(str));
	}

}
