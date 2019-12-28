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

    void printLastKRev(Node node,int k) 
    {
        int i = 0;
        while(node != null && i < k)
        {
            System.out.print(node.data + " ");
            node = node.next;
            i++;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,6);
        list = insert(list,7);
        list = insert(list,8);

        System.out.println("Linked List");
        list.printList(head);

        System.out.println("");
        head = list.reverse(head);
        
        System.out.println("Print K Reverse Linked List");
        int k = 6;
        list.printLastKRev(head,k);
        
    }
}
