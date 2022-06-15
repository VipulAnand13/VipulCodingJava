package JavaArray;

import java.util.Arrays;

public class JavaArrayLeftRotate {

	public static void main(String[] args) {
		// TODO Rotate an array in left direction by Key times:
		
		int[] number= {2,7,9,5,6,1,8};
		int key=3;
		System.out.println("Before Rotation:" + Arrays.toString(number));
		
		rotateArrayLeftKeyTimes(number,key);
		System.out.println(Arrays.toString(number));

	}
	public static int[] rotateArrayLeftKeyTimes(int [] numbers,int key) {
		for(int i=0; i<key;i++) {
			/* We store the starting value at temp variable as once we start rotation the next element will move into it and we will lose
			 * the initial value which we need to store at the last index.
			 * First loop takes care of the number of times we want to rotate left and the second loop takes care of rotating the elements.
			 */
			 
			int temp=numbers[0];
			for(int j=0;j<numbers.length-1;j++) {
				numbers[j]=numbers[j+1];
			}
			numbers[numbers.length-1]=temp;
		}
		
		
		return numbers;
	}

}
