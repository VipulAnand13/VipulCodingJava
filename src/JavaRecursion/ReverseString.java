package JavaRecursion;

public class ReverseString {
		//TO reverse a string
	
	public static String reverseString(String str,int n,String temp) {
		//int i=n;
		while(n>=0) {		
		temp += str.charAt(n);	
		n--;
		reverseString(str,n,temp);
		
		}
		
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp="";
		String str="VIPULANAND";
		int n=str.length()-1;
		System.out.println(reverseString(str,n,temp));	
		
	}

}
