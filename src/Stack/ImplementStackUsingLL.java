package Stack;

import javax.swing.event.SwingPropertyChangeSupport;

public class ImplementStackUsingLL {
    public static void main(String[] args){
    ImplementStack stack= new ImplementStack();

    stack.push(25);
    // stack.push(35);

    stack.printStack();

    }
}

class ImplementStack{
    int data;
    static Node head;

    // public static void reverseLL11(Node head){
    //     Node cur= head;
    //     Node tail= head;
        
        
    //     while(cur!=null){
    //         Node temp= cur.next;
    //         tail=cur;
    //         cur=temp;
    //     }
    // }

     static void push(int dat){
        Node newNode=new Node(dat);
        
        if(head==null)   head=newNode;

        else{
            newNode.next=head;
            head=newNode;
        }
     }

     static void printStack(){
        Node cur=head;
        while(cur!=null) {
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.print("end");
     }
     
}


