/*
Steps : 
p = head and q = head
if p == null and q == null and q->next = null then no loops
traverse p = p.next and q = q.next.next
if ( p==q) then loops exists
*/

class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void insert(int data) {
        Node newnode = new Node(data);
        newnode.next = null;
        
        if(head == null) {
            head = newnode;
        }
        else
        {
            Node last = head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = newnode;
        }
    }

    void printList(Node node) {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    void detectLoop(Node head)
    {
        Node p = head;
        Node q = head;
        boolean detect = false;

        while( p!=null && q !=null && q.next != null)
        {
            p = p.next;
            q = q.next.next;
            if(p==q)
            {
                System.out.println("Loop Detected");
                detect = true;
                return;
            }
        }
        if(detect == false)
        {
            System.out.println("No loops");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        //head.next.next.next.next.next = head.next.next;
 
        list.detectLoop(head);
        
    }
}
