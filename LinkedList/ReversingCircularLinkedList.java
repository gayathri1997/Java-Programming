class CircularLinkedList {
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
            head.next = head;
        }
        else
        {
            Node current = head;
            while(current.next != head)
            {
                current = current.next;
            }
            current.next = newnode;
            newnode.next = head;
        }
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        
        do
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next; 
        }while(current != head);

        head.next = prev;
        head = prev;
        return head;
    }

    void printList(Node node) {
        do
        {
            System.out.print(node.data + " ");
            node = node.next;
        }while(node != head);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Linked List");
        list.printList(head);

        System.out.println("");
        System.out.println("Reverse Linked List");
        head = list.reverse(head);
        list.printList(head);
        
    }
}
