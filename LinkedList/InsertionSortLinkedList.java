import java.util.*;

class LinkedList {
    static Node head;
    static Node sorted;

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

    
    // function to sort a singly linked list using insertion sort 
    void insertionSort(Node head)  
    {  
        sorted = null; 
        Node current = head; 
        while (current != null)  
        { 
            Node next = current.next; 
            sortedInsert(current);
            current = next; 
        } 
        head = sorted; 
    } 

    void sortedInsert(Node newnode)  
    { 
        /* Special case for the head end */
        if (sorted == null || sorted.data >= newnode.data)  
        { 
            newnode.next = sorted; 
            sorted = newnode; 
        }  
        else 
        { 
            Node current = sorted; 
            while (current.next != null && current.next.data < newnode.data)  
            { 
                current = current.next; 
            } 
            newnode.next = current.next; 
            current.next = newnode; 
        } 
    } 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(3);  
        list.insert(2);
        list.insert(4);
        
        System.out.println("Linked List ");
        list.printList(head);

        list.insertionSort(head);
        System.out.println();
        System.out.println("After insertion sort Linked List ");
        list.printList(head);

    }
}
