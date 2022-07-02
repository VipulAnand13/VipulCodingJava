package javaMathematics;

public class UniquePathsInGrid { 
		// To find out the unique number of ways to traverse a MxN grid
	
		//Logic : This can be done with recursion where we find out paths by using the fact that from each grid, we have two choices to move
	    //        either right or down. TC of this method is 2^(m*n)
		// 		  Now here we will use Permutation and combination to find out the number of paths to travel the grid.
		//		  Total steps: m+n  -> out of this we need to move m rows down hence total unique path= (m+n)C(m) = m+1 * m+2*....m+n/(1*2*3...n)
		//        TC for this method will be O(n) or O(m) whichever is min. 
	
	public static int uniquePathInGrid(int m, int n) {
	   //int min =Math.min(m, n);  //Considering m as greater than n.   Else to further optimize we can find min of m,n and replace m with min in below calculations.
		int count=1;
		for(int i=1; i<=m ;i++) {
			count= (count* (m+i))/i;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO 
		System.out.println(uniquePathInGrid(2,2));
	}

}
