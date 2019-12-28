/*
Linked list head1 and head2 
compare if head1.data < head2.data then
           head1.next = merge(head1.next , head2)
           return head1
        else
           head2.next = merge(head2 , head1.next)
           return head2
 if head1 == null
    return head2
 if head2 == null
    return head1
*/

class LinkedList { 

    static Node head1, head2; 

    static class Node { 

        int data; 
        Node next; 

        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 

    void printList(Node node) {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
     
    static Node merge(Node h1, Node h2) 
    { 
        if (h1 == null) 
            return h2; 
        if (h2 == null) 
            return h1; 

        if (h1.data < h2.data) { 
            h1.next = merge(h1.next, h2); 
            return h1; 
        } 
        else { 
            h2.next = merge(h1, h2.next); 
            return h2; 
        } 
    }

    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 

        // creating first linked list 
        list.head1 = new Node(10); 
        list.head1.next = new Node(30); 
        list.head1.next.next = new Node(50); 
        list.head1.next.next.next = new Node(70);  

        // creating second linked list 
        list.head2 = new Node(20); 
        list.head2.next = new Node(40); 
        list.head2.next.next = new Node(60); 

        Node mergehead = merge(head1, head2); 
  
        list.printList(mergehead);         

    } 
} 
