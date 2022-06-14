 package JavaArray;

import java.text.MessageFormat;

public class JavaMatrixSearchInSortedMatrix {

	public static void main(String[] args) {
		// TODO Search an element in a Sorted Matrix:
		
		/*
		 * For this problem: there are two approaches---
		 * 1. Brute-Force approach: Iterate through all the elements in the matrix and check if the number is present.
		 *                          This will have a Time COmplexity of O(n2).
		 *                          
		 * 2. Optimized approach: Since it is a sorted matrix, we will check the last element of every row. If the number is lesser
		 *                        than the last element then discard the column and search in the row or else if number is greater than  
		 *                        the last element then move to the last element of next row and ignore the prev row completely. 
		 *                        
		 *                        [1, 4, 7]      Lets say if we want to search 6, Start with last element of 1st row(7), if the number is 
		 *                        [2, 5, 8]      lesser than 7, then we can search in the first row, since number is greater than 4, we 
		 *                        [3, 6, 9]      move to next column and again number is greater than 5, again we move down we find it.
		 */
		
		int[][] searchMatrix = {{1, 4, 7},{2, 5, 8},{3, 6, 9}};
		int searchThisNumber=6;
		
		isNumberPresentInMatrix(searchMatrix,searchThisNumber);		

	}
	
	public static void isNumberPresentInMatrix(int[][] myMatrix,int key) {
		int row=0;
		int col=myMatrix.length-1;   // the two initialized values of row and column is of the last element of first row.  
		int count=0;
		
		while(row<myMatrix.length && col>=0) {
		if(myMatrix[row][col]==key) {
			System.out.println(MessageFormat.format("Number is present in the Matrix at:({0},{1})", row,col));
			count++;
			break;
		}
		
		if(key>myMatrix[row][col]) {
			row++;
		}
		
		else if(key<myMatrix[row][col]) {
			col--;
		}
	}
		if(count==0) System.out.println("The given number is not present in the matrix..");  
	  		
  }

}
