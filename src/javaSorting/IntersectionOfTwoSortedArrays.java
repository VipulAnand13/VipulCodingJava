package javaSorting;

public class IntersectionOfTwoSortedArrays {
	
	static void intersectionOfTwoSortedArrays(int[] a, int[] b) {
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
			if(a[i]==b[j]) {
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			
			else if(a[i]<b[j]) i++;
			
			else j++;
		}
	}
	
	// If we need to handle duplicates:
	static void intersecWOduplicates(int[] a,int[] b) {
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;				
			}
			
			if(a[i]==b[j]) {
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			
			else if(a[i]<b[j]) i++;
			
			else j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a_arr= {0,1,1,2,3,3,4,6};
		int[] b_arr= {0,2,3,3,6};
		intersectionOfTwoSortedArrays(a_arr, b_arr);
		System.out.println();
		intersecWOduplicates(a_arr, b_arr);
	}

}
