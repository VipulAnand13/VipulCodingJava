 package JavaArray;

public class JavaArrayLeadersProblem {

	public static void main(String[] args) {
		// TODO To Find the leaders in the given array: 
		
		//Leader means biggest element in the right side of the element
		
		/*In this Leader approach: we check for highest value from Right side 
		 * i.e. in Reverse Order hence we are able to solve this problem in O(n)
		 * 		
		 *But the order in which it is printed is also opposite to what we need.
		 *Hence we use an additional array to print the correct order of output.
		*/
		int[] marks= {23,76,56,13,89,45,67,35};
		int largest=Integer.MIN_VALUE;
		String s="";
		for(int z=marks.length-1;z>=0;z--) {
			if(marks[z]> largest) {
				largest=marks[z];
				System.out.print(largest + " ");
				 s = s+","+Integer.toString(largest);
				
				}
		}
		System.out.println("\nCorrect order Output:");
		
		//To print the array in the correct order:
		
		String[] leaderArray= s.split(",");
		for(int a=leaderArray.length-1;a>=0;a--) {
			System.out.print(leaderArray[a]+" ");
		}

	}

}
