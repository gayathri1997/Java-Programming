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
                firstNodeLoop(p,head);
                return;
            }
        }
        if(detect == false)
        {
            System.out.println("No loops");
        }
    }

    static void firstNodeLoop(Node p, Node head)
    {
        Node q = head;
        while(p != q)
        {
            p = p.next;
            q = q.next;
        }
        System.out.println("firstNodeLoop " + p.data );
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        Node current = head;
        // k is postion before the loop starts

        /*
              k
        10 -> 20 -> 30 -> 40
                    |     | 
                    60 -> 50 
        */
        int k = 2;
        while(current != null && k > 0)
        {
            current = current.next;
            k = k-1;
        }

        last.next = current;
 
        list.detectLoop(head);
        
    }
}
