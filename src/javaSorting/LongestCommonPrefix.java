package javaSorting;

public class LongestCommonPrefix {
	
	static boolean checkPrefix(String str1,String str2, String str3, int min) {
		boolean b1=str1.substring(0, min).equalsIgnoreCase(str2.substring(0, min));
		boolean b2=str2.substring(0, min).equalsIgnoreCase(str3.substring(0, min));
		
		if(b1 && b2) return true;
		
		return false;
	}
	
	static void longestCommonPrefix(String str1, String str2, String str3) {
		int n1= str1.length();
		int n2= str2.length();
		int n3= str3.length();
		
		int min= Math.min(n1, Math.min(n2, n3));
		
		while(min>=0) {
			boolean res=checkPrefix(str1,str2,str3,min);
			
			if(res) {
				System.out.println(str1.substring(0, min));
				break;
			}
			
			else
				min--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Apple";
		String str2="Application";
		String str3="Apply";
		longestCommonPrefix(str1, str2, str3);
	}

}
