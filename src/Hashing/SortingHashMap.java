package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingHashMap {
    public static void main(String[] args){

    Student s1= new Student(1,"Vipul");
    Student s2= new Student(2,"Rahul");
    Student s3= new Student(3,"Vishal");
    Student s4= new Student(6,"Rakesh"); 

    ArrayList<Student> st= new ArrayList<>();
        st.add(s4);
        st.add(s2);
        st.add(s1);
        st.add(s3);

        System.out.println(st);
        // The below sort is the overridden function compareTo in Student class
        Collections.sort(st);
        System.out.println(st);

        // The below sort is the declares class for sorting Students by name:
        Collections.sort(st,new StudentNameComparator());
        System.out.println(st);

        // If we dont want to create a class but just use the comparator interface(anonymous object) to implement the compare function.

        // Collections.sort(st, new Comparator<Student>() {

        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         // TODO Auto-generated method stub
        //         if(o1.name.equals(o2.name)){
        //               return o1.roll-o2.roll;
        //             }
        //          else return o1.name.compareTo(o2.name);
        //     }
            
        // });

        //Advance java lambda function.
        
        //Collections.sort(st,(o1,o2)-> o1.name.compareTo(o2.name));
    }
}

// Student comparator class can also be created
class StudentNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student stu1, Student stu2) {
        // TODO Auto-generated method stub
        
        return stu1.name.compareTo(stu2.name);
    }

    

}

// Student class created which implements comparable interface and compareTo method needs to be defined.
class Student implements Comparable<Student>{ 
    int roll;
    String name;

    public Student(int roll, String name){
        this.roll= roll;
        this.name= name;
    }
    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        if(this.roll>that.roll) return 1;
        if(this.roll<that.roll) return -1;
        return 0;
    }
    

    
}
