package JavaArray;

public class JavaArrayInto3EqualSumSubarray {

	public static void main(String[] args) {
		// TODO Split array into 3 equal sum sub-arrays:
		/*
		 *  If the entire array can be split into 3 sub arrays (start,mid,last) with each sub array having equal sum..
		 *  
		 *  To solve this problem, 
		 *  If the entire array is divided into 3 sub arrays and sum in each are equal, then it should be divisible by three.
		 *  next if we divide the sum by 3 then we can get sum of each sub array.
		 *  Now we need to traverse the array and find out if sub arrays with this sum exists.
		 *  
		 *  
		 */
		int[] myarray= {3,1,4,2,2};
		isEqualSumSubArrayPresent(myarray);
		
		

	}

	public static void isEqualSumSubArrayPresent(int[] myArray) {
		
		int sum=0;
		for(int z: myArray) {
			sum += z;
		}
		
		if(sum%3 !=0) System.out.println("NO");
		
		else {
			int eachSubArraySum= sum/3;
			int tempSum=0;
			int count=0;
			for(int w=0;w<myArray.length;w++) {
				tempSum +=myArray[w];
				if(tempSum==eachSubArraySum) {
					System.out.print(w + " ");
					tempSum=0;
					count++;
				}
			}
			System.out.println();
			if(count==3) System.out.println("YES");
			
			else System.out.println("NO");
		}
	}
}
