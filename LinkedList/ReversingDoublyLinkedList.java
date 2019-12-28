
class LinkedList { 

    static Node head; 

    static class Node { 

        int data; 
        Node next, prev; 

        Node(int d) { 
            data = d; 
            next = prev = null; 
        } 
    } 

    void reverse() { 
        Node temp = null; 
        Node current = head; 

        while (current != null) { 
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev; 
        } 

        if (temp != null) { 
            head = temp.prev; 
        } 
    } 

    void push(int data) { 

        Node new_node = new Node(data); 
        new_node.prev = null;
        new_node.next = null;

        if(head == null)
        {
            head = new_node;
        }
        else
        {
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = new_node;
            new_node.prev = current;
        }
    } 

    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 

    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 


        list.push(2); 
        list.push(4); 
        list.push(8); 
        list.push(10); 

        System.out.println("linked list "); 
        list.printList(head); 

        list.reverse(); 
        System.out.println(""); 
        System.out.println("reversed Linked List"); 
        list.printList(head); 
    } 
} 
