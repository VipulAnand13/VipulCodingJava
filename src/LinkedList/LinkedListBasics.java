package LinkedList;

public class LinkedListBasics {
    public static void main(String[] args){

        // Create object of Node class which will  be the individual nodes of the LL.
        Node n1= new Node(20);
        Node n2= new Node(35);
        Node n3= new Node(40);
        // Three Node class objects are created.
        Node head= n1;

         // now to link all the individual nod es, we need to make connection with the help of the 'next pointer' of Node class.
         n1.next=n2;     //This creates a reference of the next node in the next pointer of prev node. 
         n2.next=n3;

        // Can create Node of generic type
        NodeG<String> n11= new NodeG<>("Hello");
        NodeG<String> n12= new NodeG<>("Vipul");
        NodeG<String> n13= new NodeG<>("Welcome"); 
        NodeG<Integer> n14= new NodeG<>(13);

        NodeG<String> headG= n11;
        n11.next=n12;
        n12.next=n13;
        n13.next=n14;
        printLLG(headG);
         
       


        //To Traverse an array:
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data +"->");
            cur=cur.next;
        }
        System.out.println("null");

        // To insert a node in the LL:
        Node n6= new Node(100);
        n1.next=n6;
        n6.next=n2;
        printLL(head);

        // To insert a Node by using method.
        head=insertLL(head, 4, 99);
        printLL(head);

        head= deleteLL(head, 4);
        printLL(head);

        NodeG<Integer> n111= new NodeG<>(20);
        NodeG<Integer> n121= new NodeG<>(30);
        NodeG<Integer> n131= new NodeG<>(40); 
        NodeG<Integer> n141= new NodeG<>(13);

        NodeG<Integer> headG1= n111;
        n111.next=n121;
        n121.next=n131;
        n131.next=n141;
        // printLLG(headG1);
        System.out.println(middleElement(headG1));
        
    }

    // A LL (singly LL) is a data str that stores data in the nodes with each node having a data part and next pointer part.
    // In Node class we have one data part and a next pointer
    // LL are of 3 types: Singly LL, Doubly LL and Circular LL

        // Method to insert Node at a given position :
        public static Node insertLL(Node head,int pos, int data){
            Node newNode= new Node(data);
            if(pos==0){
                newNode.next=head;
                head=newNode;
                return head;
            }
            
            Node cur= head;              // node to iterate over the LL
            for(int i=0; i<pos-1;i++){   // iterating to the node just before the node where it needs to be placed.
                cur= cur.next;
                if(cur==null) return head; // if position is not available in LL . In a LL of size 10, cant insert at pos=50
            }

            newNode.next= cur.next;
            cur.next=newNode;
            return head;

        } 

        // Method to delete a Node from LL:
         public static Node deleteLL(Node head, int pos){
            if(head==null) return null;
            if(pos==0){
                head= head.next;
                return head;
            }
            Node cur= head;
            for(int i=0; i<pos-1; i++){
                cur=cur.next;
            }
            cur.next=cur.next.next;
            return head;
         }

        // Method to print LL:
        public static void printLL(Node head){
            Node cur= head;
            while(cur!=null){
                System.out.print(cur.data +"->");
                cur=cur.next;
            }
            System.out.println("null");
        }

        // To find the middle element
        public static int middleElement(NodeG<Integer> head){
            NodeG<Integer> slow= head;
            NodeG<Integer> fast= head.next;
            while(fast!= null && fast.next!=null ){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow.data;
        }
        
        //method to print generic String LL
        public static void printLLG(NodeG<String> headG){
            NodeG cur= headG;
            while(cur!=null){
                System.out.print(cur.data +"->");
                cur=cur.next;
            }
            System.out.println("null");
        }
    
    
}

// Node class 
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data= data;
    }
}

// Node class using generic
class NodeG<T>{
    T data;
    NodeG next;
    public NodeG(T data){
        this.data=data;
    }
}