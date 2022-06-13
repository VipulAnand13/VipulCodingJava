package JavaArray;

public class JavaArrayConsecutiveCount {

	public static void main(String[] args) {
		// TODO Count the longest length of consecutive 1s
		
		int[] random= {1,0,1,1,0,0,1,1,1,1,0,1,0,1,1,1};
		int result=countConsecutive(random);
		System.out.println("longest length of consecutive 1s: "+result);

	}
	
	public static int countConsecutive(int[] arr) {
		int count=0;
		int maxCount=0;
		for(int v:arr) {
			if(v==1) {
				count++;
				maxCount= Math.max(maxCount, count);
			}
			else if(v==0) count=0;
		}
		return maxCount;
	}

}
