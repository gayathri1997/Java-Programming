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

    void deletePrime(Node head)
    {
        // head is prime or not        
        while(isPrime(head.data))
        {
            head = head.next;
        }
        
        Node current = head;
        while(current.next != null)
        {
           
            if(isPrime(current.next.data))
            {
                Node prev = current;
                prev.next = current.next.next;
                current = prev;
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

    boolean isPrime(int n)
    {
            int flag = 0;
            for(int i = 2; i < n; ++i)
            {
                if(n%i == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if (n == 1) 
            {
                return false;
            }
            else if (n==2 || n==3)
            {
                return true;
            }
            else 
            {
                if(flag == 0)
                    return true;
                else
                    return false;
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
        

        list.deletePrime(head);
    }
}
