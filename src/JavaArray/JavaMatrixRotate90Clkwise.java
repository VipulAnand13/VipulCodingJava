package JavaArray;

import java.util.Arrays;

public class JavaMatrixRotate90Clkwise {

	public static void main(String[] args) {
		// TODO Rotate a Matrix by 90 degree clockwise:
		
		/*
		 * To solve this problem, we have 2 approaches:
		 * 1. Difficult or cumbersome approach:  we need to rotate each element by 90 degree or basically 
		 *    if we do operation on one-fourth of the array and rotate one-fourth of the array 90 degree, all elements will be rotated.
		 *    
		 * 2. Better Approach: Transpose the matrix and then swap(flip) the matrix elements about the vertical half.
		 * 
		 *                                   --|-->flip
		 *      [1,5,9,13]              [1,2,  | 3,4]                  [4,3,2,1]
		 *      [2,6,10,14]  TRANSPOSE  [5,6,  | 7,8]        SWAP      [8,7,6,5]
		 *      [3,7,11,15]  -------->  [9,10, | 11,12]     -------->  [12,11,10,9]
		 *      [4,8,12,16]             [13,14,| 15,16]                [16,15,14,13]
		 *                                     |
		 */                              
		
		int[][] myMatrix= {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
		System.out.println("Before Rotation:");
		printMatrix(myMatrix);
		
		System.out.println();
		
		
		System.out.println("After Rotation:");
		printMatrix(rotateMatrixBy90(myMatrix));

	}
	
	public static int[][] rotateMatrixBy90(int[][] rotate){
		int[][] rotateMatrix =rotate.clone();
		
		//Transpose the matrix:
		rotateMatrix=transposeOfMatrix(rotateMatrix);
		
		//To swap columns about the vertical half:
		int n=rotate.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {         //To swap about the vertical half by swapping each row element about vertical half.
				int swapTemp=rotateMatrix[i][j];
				rotateMatrix[i][j]= rotateMatrix[i][n-1-j];
				rotateMatrix[i][n-1-j]= swapTemp;
			}
		}
		
		return rotateMatrix;
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
