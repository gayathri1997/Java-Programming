class BinarySearchTree {
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    }

    Node root;
    Node temp;

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
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    }
    
    void mirror()
    {
        mirrorUtil(root);
    }
    void mirrorUtil(Node root)
    {
        if(root == null)
            return;
        else    
            mirrorUtil(root.left);
            mirrorUtil(root.right);
            temp = root.left;
            root.left = root.right;
            root.right = temp;
    }

    public static void main(String[] args) { 
        BinarySearchTree bst = new BinarySearchTree(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 */
        bst.insert(50); 
        bst.insert(30); 
        bst.insert(70); 
  
        bst.inorder();

        bst.mirror();

        System.out.println("Mirror of Binary Tree");
        bst.inorder();
    }
}