package LinkedList;

public class KthElementFromLast {
    public static void main(String[] args){
        Node<Integer> n1= new Node<>(20);
        Node<Integer> n2= new Node<>(12);
        Node<Integer> n3= new Node<>(2);
        Node<Integer> n4= new Node<>(10);
        Node<Integer> n5= new Node<>(1);
        Node<Integer> n6= new Node<>(9);
        Node<Integer> head= n1;

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

       System.out.println(kthElement(head, 4)); 

    }

    public static int kthElement(Node<Integer> head, int k){
        Node<Integer> cur =head;
        int count=0;
        while(cur!= null) {
            count++;
            cur= cur.next;
        }


        cur=head;
        for(int i=0; i<count-k;i++){
            cur=cur.next;
        }
        return cur.data;
    }
}

class Node<T>{
    int data;
    Node<T> next;
    public Node(int data){
        this.data= data;
    }
}
