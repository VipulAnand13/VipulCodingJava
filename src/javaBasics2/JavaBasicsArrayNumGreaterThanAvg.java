package javaBasics2;

public class JavaBasicsArrayNumGreaterThanAvg {

	public static void main(String[] args) {
		// TODO Numbers greater than the Avg of the array
		int[] marks= {2,6,35,68,9,42,54};
		int avg=0;
		for (int x: marks) {
			avg += x;
		}
		avg /= marks.length;
		System.out.println("Avg of numbers is "+ avg);
		for (int x: marks) {
			if(x>=avg) System.out.print(x + " ");
		}
	}

}
