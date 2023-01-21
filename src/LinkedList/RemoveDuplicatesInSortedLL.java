package LinkedList;

public class RemoveDuplicatesInSortedLL {
    public static void main(String[] args){
        Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(2);
        Node n4= new Node(9);
        Node n5= new Node(9);
        Node n6= new Node(9);
        Node n7= new Node(10);
        Node n8= new Node(10);
        Node head= n1;

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;

        printLL(head);
        System.out.println();
        removeDuplicates(head);
        printLL(head);
    }

    //Remove duplicates from a Sorted LL:
    static void removeDuplicates(Node head){
        Node cur= head;
        while(cur.next!=null){
            // if(cur.next==null && cur.data==cur.next.data) {
            //     cur.next=null;
            //     break;
            // }
            
            if(cur.data== cur.next.data){
                cur.next=cur.next.next;
            }

            else
            cur=cur.next;
        }
    }
    public static void printLL(Node head){
        Node cur= head;
        while(cur!= null){
            System.out.print(cur.data+" ");
            cur= cur.next;
        }
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data= data;
    }
}
