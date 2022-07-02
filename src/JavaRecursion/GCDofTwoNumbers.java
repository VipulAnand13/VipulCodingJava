package JavaRecursion;

public class GCDofTwoNumbers {

	//To find out the GCD or HCF of two numbers:
	
	public static int genGCDMethod(int a,int b) {      //In general method, min(24,36) is taken and try to find out if it divides both numbers
			for(int i=Math.min(a, b);i>1;i--) {      // else the number is decremented till they find divisor which divides both numbers.
				System.out.println(a+" "+ b+" "+ i);
			if(a%i==0 && b%i==0) return i;
		}
		return 1;
	}
	
	
	// ***********************************OPTIMISED METHOD*********************************************//
	public static int euclidGCDMethod(int a,int b) {        // Euclid GCD: gcd(a,b) = gcd(a-b,b)
		
		if(a<b) {   // To swap the numbers
			a=a+b;
			b=a-b;
			a=a-b;
			//euclidGCDMethod(a,b);	
		}
		System.out.println(a+" "+b);  // To print the numbers
		
	    if(a==b || b==1) return b;   // base condition
	    		
	    return euclidGCDMethod(a-b,b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(genGCDMethod(24,36));
		System.out.println(euclidGCDMethod(20,5));
	}

}
