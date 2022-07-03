package JavaRecursion;

public class FibonacciSeries {
	// To find out the Fibonacci Series upto Nth term. 
	// Logic: arr[i] = arr[i-1]+ arr[i-2]  --> Present element is equal to sum of prev. two elements.
	
	public static int[] fibo(int n, int[] fibo){
		fibo[0]=0;
		fibo[1]=1;
		
		for(int i=2;i<n;i++) {
			fibo[i]=fibo[i-1]+ fibo[i-2];
		}
		
		return fibo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15 ;
		int[] fibo=new int[n];
		fibo(n, fibo);
		for(int e: fibo) {
			System.out.print(e+" ");
		}
	}

}
