package LinkedList;

public class MiddleElementOfLL {
    public static void main(String[] args){
        
        Node<Integer> n1= new Node<>(25);
        Node<Integer> n2= new Node<>(35);
        Node<Integer> n3= new Node<>(45);
        Node<Integer> n4= new Node<>(50);

        Node<Integer> head= n1;

        n1.next= n2;
        n2.next= n3;
        n3.next= n4;

        printLL(head);

        int out= middleElement(head);
        System.out.println(out);
        
    }

    public static int middleElement(Node<Integer> head){
        Node<Integer> slow= head;
        Node<Integer> fast= head.next;
        while(fast!= null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void printLL(Node<Integer> head){
        Node<Integer> cur= head;
        while(cur!=null){
            System.out.print(cur.data +"->");
            cur=cur.next;
        }
        System.out.println("null");
    }
}

class Node<Integer>{
    int data;
    Node<Integer> next;
    public Node(int data){
        this.data= data;
    }
}


