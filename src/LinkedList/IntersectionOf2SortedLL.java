package LinkedList;

public class IntersectionOf2SortedLL {
    public static void main(String[] args){
        NodeDouble n1= new NodeDouble(1);
        NodeDouble n2= new NodeDouble(2);
        NodeDouble n3= new NodeDouble(5);
        NodeDouble n4= new NodeDouble(9);
        NodeDouble n5= new NodeDouble(11);
        NodeDouble head= n1;

        NodeDouble n6= new NodeDouble(5);
        NodeDouble n7= new NodeDouble(9);
        NodeDouble n8= new NodeDouble(11);
        NodeDouble n9= new NodeDouble(15);
        NodeDouble n10= new NodeDouble(18);
        NodeDouble head2= n6;
        

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;
        n9.next=n10;

        NodeDouble new1= intersectionOfLL(head,head2);
        printLL(new1);
        
    }

    public static NodeDouble intersectionOfLL(NodeDouble head,NodeDouble head2){
        NodeDouble cur=null;

        while(head.next!=null && head2.next!=null){
            if(head.data==head2.data && cur==null){
                cur=head;
                head=head.next;
                head2= head2.next;
            }

            if(head.data==head2.data ){
                cur.next=head;
                head=head.next;
                head2= head2.next;
            }
            if(head.data<head2.data) head=head.next;

            if(head.data>head2.data) head2=head2.next;

            // printLL(head);
            // System.out.println();
            // printLL(head2);
            // System.out.println();
        }
        

        return cur;
 }


    public static void printLL(NodeDouble head){
        NodeDouble cur= head;
        while(cur!= null){
            System.out.print(cur.data+" ");
            cur= cur.next;
        }
    }
    
}
