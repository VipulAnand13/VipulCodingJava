package JavaArray;

import java.util.Arrays;

public class JavaArrayTransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Find the Transpose of Matrix:
		
		/*
		 * To find transpose: Swap the elements in the upper Triangular matrix.
		 *  Two things need to be done-
		 *  1. Upper Triangular matrix: iterate all rows and start from next(one column ahead of previous) column. 
		 *  2. Swap the element values.
		 */
		
		int[][] myMatrix = {{2,4,6},{8,10,12},{14,16,18}};
		
		System.out.println("Before Transpose:");
		printMatrix(myMatrix);
		
		System.out.println();
		
		
		System.out.println("After Transpose:");
		printMatrix(transposeOfMatrix(myMatrix));
		

	}
	
	public static int[][] transposeOfMatrix(int[][] myMatrix) {
		int[][] dummyMatrix=myMatrix.clone();
		
		//Main transpose logic:
		int n=myMatrix.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {                      // This is the crucial step for matrix transpose where we skip one column with each row ahead
				int swap=dummyMatrix[i][j];
				dummyMatrix[i][j]=dummyMatrix[j][i];
				dummyMatrix[j][i]=swap;
			}
		}
		
		return dummyMatrix;
	}
	
	public static void printMatrix(int[][] printmyMatrix){
		for(int[] row: printmyMatrix)
			System.out.println(Arrays.toString(row));		
	}

}
