package JavaRecursion;

public class JavaRecurPowerOfInteger {

	public static void main(String[] args) {
		// TODO Recursive function to get the power a an integer:
		
      int powerofnumber= powerOfInteger(4,3);
      System.out.println(powerofnumber);
      
	}
	public static int powerOfInteger(int integer,int exponent) {
		
		if(exponent==0) return 1;             // if(exponent==1) return integer;
		return powerOfInteger(integer,exponent-1) * integer;

	}
}