package LinkedList;


public class ReverseLL {
    public static void main(String[] args){
        
        NodeDouble n1= new NodeDouble(1);
        NodeDouble n2= new NodeDouble(2);
        NodeDouble n3= new NodeDouble(3);
        NodeDouble n4= new NodeDouble(4);
        NodeDouble n5= new NodeDouble(3);
        NodeDouble n6= new NodeDouble(2);
        NodeDouble n7= new NodeDouble(1);
        //Node n8= new Node(1);
        NodeDouble head= n1;

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
       //n7.next=n8;
       
       // NodeDouble<Integer> last= n7;
        n7.prev=n6;
        n6.prev=n5;
        n5.prev=n4;
        n4.prev=n3;
        n3.prev=n2;
        n2.prev=n1;

        reverseLL11(head);
    }

    public static void reverseLL11(NodeDouble head){
        NodeDouble cur= head;
        
        //Reaches the end node of the LL: 
        while(cur.next!=null){
            cur=cur.next;
        }

        // Now iterate back from the End node using prev
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.prev;
        }
        System.out.print("end");
    }
}


class NodeDouble{
    int data;
    
    NodeDouble next;
    NodeDouble prev;

    public NodeDouble(int data){
        this.data=data;
    }
}