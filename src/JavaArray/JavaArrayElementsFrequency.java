package JavaArray;

import java.util.Arrays;

public class JavaArrayElementsFrequency {

	public static void main(String[] args) {
		// TODO Find the frequency of all the elements in a Sorted Array
		
		int[] ageOfStudents= {10,12,15,12,15,19,17,16,13,14,15,10,21};
		Arrays.sort(ageOfStudents);
		//Brute-Force Approach:
		int count=0;
		for(int w=0;w<ageOfStudents.length-1;w++) {
			
			if(ageOfStudents[w]!=ageOfStudents[w+1]) {
				count++;
				System.out.println(ageOfStudents[w]+" has a frequency of:"+ count);
				count=0;
			   }
			else if(ageOfStudents[w]==ageOfStudents[w+1]) {
					count++;
				}
			else if(w==ageOfStudents.length-1 && ageOfStudents[w]==ageOfStudents[w-1]) {
					count++;
					System.out.println(ageOfStudents[w]+" has a frequency of:"+ count);
					break;
				}
			else if(w==ageOfStudents.length-1 && ageOfStudents[w]!=ageOfStudents[w-1]) {
				    System.out.println(ageOfStudents[w]+" has a frequency of: 1");
			}
				
				
		}
		

	}

}
