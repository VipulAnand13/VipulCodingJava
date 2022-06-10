package JavaArray;

public class JavaArraySortedCheck {

	public static void main(String[] args) {
		// TODO Check if the array is sorted
		//int[] numbers= {34,67,89,45,63,75};
		int[] numbers= {12,23,37,45,63,75};
		
		boolean isSorted=true;
		
		for(int z=0;z<numbers.length-1;z++) {
			if(numbers[z+1]< numbers[z]) isSorted=false;
		}
        if(isSorted==true) System.out.println("Numbers are kept in sorted manner");
        else System.out.println("Numbers are not sorted..");
	}

}
