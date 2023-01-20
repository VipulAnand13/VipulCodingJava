package Hashing;

import java.util.ArrayList;
import java.util.List;

public class ListOfListOfIntegers {
    public static void main(String[] args){

        List<List<Integer>> mylist= new ArrayList<List<Integer>>();

        // Number of lists inside this list- let this be 4
        for(int i=0; i<4; i++){
            List<Integer> l= new ArrayList<>();
            mylist.add(l);
        }

        //Now till this point we have a list 'mylist' which contains 4 lists in it.

        mylist.get(0).add(3);
        mylist.get(0).add(7);

        mylist.get(1).add(2);
        mylist.get(1).add(5);

        mylist.get(2).add(6);
        mylist.get(2).add(9);

        mylist.get(3).add(1);
        mylist.get(3).add(4);

        //To print the list of list of integers.
        System.out.println(mylist);


    }


}
