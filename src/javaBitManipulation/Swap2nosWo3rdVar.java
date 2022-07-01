package javaBitManipulation;

public class Swap2nosWo3rdVar {
	// To swap 2 numbers without 3rd variable, we need to use XOR operation
	public static void swapTwoNums(int a, int b) {
		System.out.println("A: "+a +" B: "+b);
		a= a^b;    //This can be treated as A=A+B 
		b= a^b;    //This can be treated as B=A-B
		a= a^b;    //This can be treated as A=A-B
		System.out.println("A: "+a +" B: "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapTwoNums(7,9);  
	}

}
