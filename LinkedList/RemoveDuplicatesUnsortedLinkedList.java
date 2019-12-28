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

    void removeDuplicates(Node head)
    {
        Node p = head;

        while(p!=null)
        {
            Node q = p;
            while(q.next!=null)
            {
                if(p.data == q.next.data)
                {
                    q.next = q.next.next;
                }
                else
                {
                    q = q.next;
                }
            }
            p = p.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(1);
        list.insert(4);
        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(3);

        
        System.out.println("Linked List ");
        list.printList(head);

        list.removeDuplicates(head);

        System.out.println();
        System.out.println("Linked List with no duplicates ");
        list.printList(head);
        
    }
}
