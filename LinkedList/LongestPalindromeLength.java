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

    int countCommon(Node a, Node b) 
    { 
        int count = 0; 

        for (; a != null && b != null; a = a.next, b = b.next) 
        {
            if (a.data == b.data)
            {
                ++count; 
            }
            else
            {
               break;
            } 
        }
    return count; 
    }
    
    int maxPalindrome(Node head)
    {
        int length = 0;
        Node current = head;
        Node prev = null;

        while(current != null)
        {
            Node next = current.next;
            current.next = prev;

            length = Math.max(length,2 * countCommon(prev, next)+1);
            length = Math.max(length,2 * countCommon(current, next));

            prev = current;
            current = next;
        }
        return length;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        

        System.out.println("Linked List");
        list.printList(head);
        System.out.println();

        System.out.print("Longest Palindrome length : " + list.maxPalindrome(head));
        
    }
}
