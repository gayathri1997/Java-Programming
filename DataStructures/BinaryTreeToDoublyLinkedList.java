class BinarySearchTree {
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    }

    Node root,head = null,newnode,current; 

    BinarySearchTree() {  
        root = null;  
    } 

    void insert(int key) { 
       root = insertRec(root, key); 
    }

    Node insertRec(Node root, int key) { 
  
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 

        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root; 
    }

    void inorder()  {
       inorderRec(root); 
    } 

    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(root.key + " "); 
            inorderRec(root.right); 
        } 
    }
    
    void BinaryTreeToDoublyLinkedList() {
        BinaryTreeToDoublyLinkedListRec(root);
    }
    
    void BinaryTreeToDoublyLinkedListRec(Node root) {
        if (root != null) { 
            BinaryTreeToDoublyLinkedListRec(root.left); 
            insertIntoDoubly(root.key);
            BinaryTreeToDoublyLinkedListRec(root.right); 
        } 
    }
    
    void insertIntoDoubly(int data)
    {
        Node newnode = new Node(data); 
        newnode.left = null;
        newnode.right = null;

        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node current = head;
            while(current.right != null)
            {
                current = current.right;
            }
            current.right = newnode;
            newnode.left = current;
        }
    }

    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.key + " "); 
            node = node.right; 
        } 
    } 
    
    void print()
    {
        printList(head);
    }
    public static void main(String[] args) { 
        BinarySearchTree bst = new BinarySearchTree(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        bst.insert(50); 
        bst.insert(30); 
        bst.insert(20); 
        bst.insert(40); 
        bst.insert(70); 
        bst.insert(60); 
        bst.insert(80); 
        
        System.out.println("Binary Search Tree");
        bst.inorder();
        
        bst.BinaryTreeToDoublyLinkedList();
        
        System.out.println();
        System.out.println();
        System.out.println("Doubly Linked List");
        bst.print();

        
    }
}