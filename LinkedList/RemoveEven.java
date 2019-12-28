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

    void deleteEven(Node head)
    {
        // head is even or not        
        while((head.data % 2) == 0)
        {
            head = head.next;
        }
        
        Node current = head;
        while(current != null)
        {
            if((current.next.data)%2 == 0)
            {
                Node prev = current;
                current = current.next.next;
                prev.next = current;
            }
            else
            {
                current = current.next;
            }
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
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
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);

        list.deleteEven(head);
    }
}
