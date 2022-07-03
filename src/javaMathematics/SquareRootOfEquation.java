package javaMathematics;

public class SquareRootOfEquation {
	//To find out the square root of the equation:
	
	public static double[] squareRoot(int a,int b, int c, double[] arr) {
		double det=(b*b)-(4*a*c);
		if(det>=0) {
			arr[0]= (-b + Math.sqrt(det))/(2*a) ;
			arr[1]= (-b - Math.sqrt(det))/(2*a) ;
		}
		else
			System.out.println("Complex roots");
	  return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr= new double[2]; 
		squareRoot(1,-11,20, arr);
		
		for(double x: arr) System.out.print(x + " ");
	}

}
