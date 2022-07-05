package javaString;

public class ReverseString {
	//To reverse a String
	
	static String reverseString(String str) {
		String out="";
		for(int z=str.length()-1;z>=0;z--) {
			out += str.charAt(z);
		}
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("VIPUL") );
	}

}
