import java.util.*;

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

    boolean isPalindrome(Node head)
    {
        Node curr = head;
        Stack<Integer> stack=new Stack<Integer>();

        while(curr!=null)
        {
            stack.push(curr.data);
            curr = curr.next;
        }

        boolean isPalindrome = true;
        Node temp = head;
        while(temp!=null)
        {
            int i = stack.pop();
            if(temp.data == i)
            {
                isPalindrome = true;
            }
            else
            {
                isPalindrome = false;
                break;
            }
            temp = temp.next;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3); 
        list.insert(3);  
        list.insert(2);
        list.insert(1);
        
        System.out.println("Linked List ");
        list.printList(head);

        System.out.println();
        boolean isPalindrome = list.isPalindrome(head);
        System.out.println("Linked is a palindrome ? " + isPalindrome);

    }
}import java.util.*;

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

    boolean isPalindrome(Node head)
    {
        Node curr = head;
        Stack<Integer> stack=new Stack<Integer>();

        while(curr!=null)
        {
            stack.push(curr.data);
            curr = curr.next;
        }

        boolean isPalindrome = true;
        Node temp = head;
        while(temp!=null)
        {
            int i = stack.pop();
            if(temp.data == i)
            {
                isPalindrome = true;
            }
            else
            {
                isPalindrome = false;
                break;
            }
            temp = temp.next;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3); 
        list.insert(3);  
        list.insert(2);
        list.insert(1);
        
        System.out.println("Linked List ");
        list.printList(head);

        System.out.println();
        boolean isPalindrome = list.isPalindrome(head);
        System.out.println("Linked is a palindrome ? " + isPalindrome);

    }
}
