package javaMathematics;

public class LCMofTwoNumbers {

	public static int euclidGCDMethod(int a,int b) {        // Euclid GCD: gcd(a,b) = gcd(a-b,b)
		
		if(a<b) {   // To swap the numbers
			a=a+b;
			b=a-b;
			a=a-b;
			//euclidGCDMethod(a,b);	
		}
		//System.out.println(a+" "+b);  // To print the numbers
		
	    if(a==b || b==1) return b;   // base condition
	    		
	    return euclidGCDMethod(a-b,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40;
		int b=30;
		int HCF=euclidGCDMethod(a,b);
		System.out.println("HCF: "+HCF);
		int LCM= (a*b)/HCF;
		System.out.println("LCM: "+LCM);
		
	}

}
