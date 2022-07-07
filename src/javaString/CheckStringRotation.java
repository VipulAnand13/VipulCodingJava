package javaString;

public class CheckStringRotation {
	
	public static boolean stringRotation(String str, String ptr) {
		
		String dupStr= str + str;
		if(dupStr.contains(ptr)) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringRotation("qwerty", "tyqwer"));
	}

}
