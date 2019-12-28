
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

        do  { 
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev; 
        }while(current != head);

        head = current.next;
 
    } 

    void push(int data) { 

        Node new_node = new Node(data); 
        new_node.prev = null;
        new_node.next = null;

        if(head == null)
        {
            head = new_node;
            head.next = head;
            new_node.prev = null;
        }
        else
        {
            Node current = head;
            while(current.next != head)
            {
                current = current.next;
            }
            current.next = new_node;
            new_node.prev = current;
            head.prev = new_node;
            new_node.next = head;
        } 
    } 

    void printList(Node node) { 
        do { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } while (node != head);
    } 

    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 

        
        list.push(2); 
        list.push(4);
        list.push(6); 
        list.push(8);

        System.out.println("linked list "); 
        list.printList(head); 

        list.reverse(); 
        System.out.println(""); 
        System.out.println("reversed Linked List"); 
        list.printList(head);
    } 
} 
