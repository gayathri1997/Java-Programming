/*
According to Floyd's Algorithm distance from head to loop and p to loop are same
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
                removeLoop(p,head);
                return;
            }
        }
        if(detect == false)
        {
            System.out.println("No loops");
        }
    }

    static void removeLoop(Node p,Node head)
    {
        Node q = head;
        Node prev = null;
        while(p != q)
        {
            prev = p;
            p = p.next;
            q = q.next;
        }
        prev.next = null;
        System.out.println("Loop Removed");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        head.next.next.next.next.next = head.next.next;
 
        list.detectLoop(head);
        System.out.println("Linked List is");
        list.printList(head);
        
    }
}
