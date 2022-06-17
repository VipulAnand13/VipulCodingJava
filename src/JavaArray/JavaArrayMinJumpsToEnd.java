package JavaArray;

public class JavaArrayMinJumpsToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] jumps= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n= jumps.length;
        int output= minJumpsToLastElement(jumps,  n);
        System.out.println(output);
        
	}
	
	public static int minJumpsToLastElement(int[] arr, int n) {
		int minCount=0;
		int i=0;
		while(i<n) {
			
			i += arr[i];
			minCount++;
			
			if(i>=n-1)  break;
			
			if(arr[i]==0) return -1;
		}
		
		
		return minCount;
	}

}
