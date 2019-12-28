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

    public static LinkedList insert(LinkedList list,int data) {
        Node newnode = new Node(data);
        newnode.next = null;
        
        if(list.head == null) {
            list.head = newnode;
        }
        else
        {
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = newnode;
        }
        return list;
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next; 
        }
        node = prev;
        return prev;
    }

    void printList(Node node) {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);

        System.out.println("Linked List");
        list.printList(head);

        System.out.println("");
        System.out.println("Reverse Linked List");
        head = list.reverse(head);
        list.printList(head);
        
    }
}
