package javaSorting;

public class UnionOfSortedArrays {
	//To find the union of the two sorted arrays
	
	static void unionOfSortedArrays(int[] a,int[] b) {
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
			if(a[i]!= b[j]) {
				System.out.print(a[i] +  " "+ b[j] + " ");
				i++;
				j++;
			}
			
			else if(a[i]==b[j]) {
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,2,3,5};
		int[] b= {2,3,3,4};
		unionOfSortedArrays(a,b);
	}

	static void printArr(int[] a) {
		for(int e: a) {
			System.out.print(e+" ");			
		}
		System.out.println();
	}
}
