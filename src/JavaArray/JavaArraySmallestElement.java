package JavaArray;

public class JavaArraySmallestElement {

	public static void main(String[] args) {
		// TODO Smallest Element in an array
		
		int[] marks= {50,45,39,75,66,89,72};
		
		System.out.println(lowestMarks(marks));
	}
	
	public static int lowestMarks(int[] dummymarks) {
	
		int lowestmarks=dummymarks[0];
		for(int x:dummymarks) {
			if(x<lowestmarks) lowestmarks=x;
		}
		return lowestmarks;
	}

}
