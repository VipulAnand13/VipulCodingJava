package Hashing;

public class InternalWorking {
    public static void main(String[] args){
        // Hashing : Hash function provides unique values to objects and attributes.
        //           1. Same objects should have same hashcode.
        //           2. Two objects which are different may have same hashcode due to collision.

        String s1="Vipul";
        String s2="Anand";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
