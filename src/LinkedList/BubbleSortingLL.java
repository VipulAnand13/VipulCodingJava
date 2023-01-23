package LinkedList;

public class BubbleSortingLL {
    public static void main(String[] args){
        
        NodeDouble n1= new NodeDouble(20);
        NodeDouble n2= new NodeDouble(12);
        NodeDouble n3= new NodeDouble(2);
        NodeDouble n4= new NodeDouble(10);
        NodeDouble n5= new NodeDouble(1);
        NodeDouble n6= new NodeDouble(9);
        NodeDouble head= n1;

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        printLL(head);
        System.out.println();
        bubbleSort(head);
        printLL(head);

    }
    static void bubbleSort(NodeDouble head){
        NodeDouble cur =head;
        int count=0;

        while(cur!= null){
            count++;
            cur= cur.next;
        }

        cur= head;
        for(int i=0;i<count-1;i++){
            cur=head;
            for(int j=0; j<count-1;j++){
                if(cur.data> cur.next.data){
                    int temp=cur.data;
                    cur.data=cur.next.data;
                    cur.next.data= temp;
                }
                
                cur= cur.next;
            }
            
            
        }
    }

    public static void printLL(NodeDouble head){
        NodeDouble cur= head;
        while(cur!= null){
            System.out.print(cur.data+" ");
            cur= cur.next;
        }
    }
}

class NodeDouble{
    int data;
    NodeDouble next;
    public NodeDouble(int data){
        this.data=data;
    }
}
