package javaMathematics;

public class TrailingZerosInFactorial {
	// TO find out the number of Trailing Zeroes in the N factorial:
	
	// Logic:  Zeroes are added due to factors of 2 & 5 but the number of trailing zeroes can be estimated directly from the number of 5s.
	//         To fetch the number of 5s , we cant directly use  n/5 as for n=25; no of 5s will be 25/5 = 5 which is wrong as 25=5*5
	//              and no of 5s become equal to 6. 
	//         Hence use this logic: while(n>1)  noOfFive += n/5; --> 25/5=5 +  5/5=1 =   6 -> correct value
	
	public static int trailingZeroesInFactorial(int n) {
		int count=0;
		while(n>1) {
			count += n/5;
			n=n/5;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(trailingZeroesInFactorial(25));
	}

}
