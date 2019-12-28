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
    
    int diameter()
    {
        return diameterUtil(root);
    }
    int diameterUtil(Node root)
    {
        if (root == null) 
            return 0; 
            
        int lheight = height(root.left); 
        int rheight = height(root.right); 
  
        int ldiameter = diameterUtil(root.left); 
        int rdiameter = diameterUtil(root.right); 
  
        return Math.max(lheight + rheight + 1, 
                        Math.max(ldiameter, rdiameter)); 
    }
    
    static int height(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        
        return ( 1 + Math.max(height(node.left),height(node.right)));
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
  
        bst.inorder();

        System.out.println("height of BST : " + bst.diameter());
    }
}
