package LinkedList;

public class PalindromeUsingSinglyLL {
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

        palindrome(head);

        Node n11= new Node(1);
        Node n21= new Node(2);
        Node n31= new Node(3);
        Node n41= new Node(4);
        Node n51= new Node(3);
        Node n61= new Node(5);
        Node n71= new Node(1);
        //Node n81= new Node(1);
        Node headNew= n11;
        n11.next=n21;
        n21.next=n31;
        n31.next=n41;
        n41.next=n51;
        n51.next=n61;
        n61.next=n71;
        //n71.next=n81;

        System.out.println(palindromeCheck(headNew));

    }
    static void palindrome(NodeDouble head){
        NodeDouble slow= head;
        NodeDouble fast= head;
        //int count=0;
        // while(last.next!=null){
        //     count++;
        //     last=last.next;
        // }
        String che="";

        while(fast!=null && fast.next!=null){
            che +=slow.data;
            slow=slow.next;
            
            fast=fast.next.next;
        }
        
        //System.out.println(che);
        // In case of odd number of nodes, The middle node is added to the second string 'chm' but no issues as it is not considered while comparing as i and m-i is compared.
        
        String chm="";
        while(slow!=null){
            chm += slow.data;
            slow=slow.next;
        }
        //System.out.println(chm);

        int m= chm.length()-1;
        int count=0;
        for(int i=0; i<che.length();i++){
            if(che.charAt(i)== chm.charAt(m-i)) {
                //System.out.println(che.charAt(i)+" "+chm.charAt(m-i));
                count++;
            }
            else {
                count=0;
                //System.out.println("hey");
                break;
            }
        }
       // System.out.println(count);
        if(count>0) System.out.println("You got a Palindrome");

        else System.out.println("Not a Palindrome");

    }

    // to check palindrome by reversing the half LL
    static boolean palindromeCheck(Node head){
        Node middle= middleNode(head);
        Node tail= reverse(middle); // conatins the head of the half part which got reversed
        
        Node cur=head;
        while(cur.next!=null){
            if(cur.data==tail.data){
                cur=cur.next;
                tail=tail.next;
            }
            else return false;
        }
        return true;
    }

    static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node prev=null;
        Node cur= head;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }

    static Node middleNode(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
