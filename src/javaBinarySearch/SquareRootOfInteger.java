package javaBinarySearch;

public class SquareRootOfInteger {
	
	static int squareRoot(int n) {
		int ans=0;
		int left=0;
		int right=n;
		while(left<=right) {
			int mid=  (left+right)/2;
			//System.out.println(mid);
			if((mid*mid)==n) return mid;
			if((mid*mid)<n) {
				ans=mid;
				left= mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(48));
	}

}
