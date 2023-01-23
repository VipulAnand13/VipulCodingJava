package LinkedList;

public class DeleteKthPointerLL {
    // cant delete last element with this.
    public static void main(String[] args){

        NodeNew<Integer> n1= new NodeNew<>(20);
        NodeNew<Integer> n2= new NodeNew<>(22);
        NodeNew<Integer> n3= new NodeNew<>(24);
        NodeNew<Integer> n4= new NodeNew<>(28);
        NodeNew<Integer> n5= new NodeNew<>(30);

        NodeNew<Integer> head= n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        printLL(head);
        deleteKth(n2);
        printLL(head);
        
    } 

    public static void deleteKth(NodeNew ns){
        NodeNew<Integer> cur= ns;

        
        cur.data= cur.next.data;
        cur.next=cur.next.next;
    }
    public static void printLL(NodeNew<Integer> head){
        NodeNew<Integer> cur= head;
        while(cur!=null){
            System.out.print(cur.data +"->");
            cur=cur.next;
        }
        System.out.println("null");
    }
}

class NodeNew<T> {
    int data;
    NodeNew<T> next;
    public NodeNew(int data){
        this.data=data;
    }
}