package JavaRecursion;

public class JavaRecurNumOfPathInMatrix {

	public static void main(String[] args) {
		// TODO Recursive function to find the number of paths in a N x M Matrix:
		
		/*
		 * In this problem, the main part of the solution is to find the base case or base condition.
		 * As we can move only in right or downward direction, the number of ways to move in a single row or single column matrix
		 * is only one. Keeping this as the base condition, we can create athe recursive function for this.
		 */
		System.out.println(numbersOfPathInMatrix(3,3));
		//System.out.println(numbersOfPathInMatrixBlock(3,3));

	}
	
	public static int numbersOfPathInMatrix(int n, int m) {
		
		if(n==1 || m==1) return 1;
		
		int rightDirection = numbersOfPathInMatrix(n, m-1);
		int downDirection = numbersOfPathInMatrix(n-1, m) ;
		
		return rightDirection + downDirection;
	}

	
}
