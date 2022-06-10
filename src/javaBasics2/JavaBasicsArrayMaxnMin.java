package javaBasics2;

public class JavaBasicsArrayMaxnMin {

	public static void main(String[] args) {
		// TODO Max n Min of Array
      int[] numbers= {2,4,8,43,78,45};
      int Max=numbers[0];
      int Min=numbers[0];
      
      for(int x : numbers) {
    	  if(x>Max) Max=x;
    	  if(x<Min) Min=x;
      }
      System.out.println("Maximum: "+ Max +"\n"+ "Minimum: "+ Min );
	}

}
