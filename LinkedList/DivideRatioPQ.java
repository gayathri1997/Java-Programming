class LinkedList {
    static Node head,head1;

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

    void dividePQ(Node head,int p,int q)
    {
        Node current = head;
        int length = 0;
        while(current!=null)
        {
            length = length + 1;
            current = current.next;
        }
        int temp = 0;
        current = head;
        if( (p+q) == length)
        {
            Node prev = null;
            while(current != null && temp < p )
            {
                prev = current;
                current = current.next; 
                temp = temp + 1;
            }
            prev.next = null;
            head1 = current;
        }
        else
        {
            System.out.println("ratio improper");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Linked List");
        list.printList(head);

        System.out.println();
        System.out.println("Divide into ratio p:q");
        list.dividePQ(head,1,4);

        System.out.println("1st Linked List");
        list.printList(head);

        System.out.println();
        System.out.println("2nd Linked List");
        list.printList(head1);
    }
}
