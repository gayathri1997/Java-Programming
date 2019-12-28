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

    void printList(Node node) {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    int sum(Node head)
    {
        if(head == null)
        {
            return 0;
        }
        int sum = 0;
        Node current = head;
        while(current.next != null)
        {
            if(current.data > current.next.data)
            {
                sum = sum + current.data;
            }
            current = current.next;
        }
        if(current.data > head.data)
        {
            sum = sum + current.data;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list,4);
        list = insert(list,1);
        list = insert(list,5);
        list = insert(list,6);

        System.out.println("Linked List");
        list.printList(head);

        System.out.println();
        System.out.println(list.sum(head));
    }
}
