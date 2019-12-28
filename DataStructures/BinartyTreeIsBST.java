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
    
    boolean isBST()
    {
        return isBSTUtil(root,0,999);
    }
    
    boolean isBSTUtil(Node root,int min,int max)
    {
        if(root == null)
        {
             return true;
        }   
        
        if(root.key < min || root.key > max)
        {
            return false;
        }
            
        return isBSTUtil(root.left,min,root.key-1) && isBSTUtil(root.right,root.key+1,max);
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

        System.out.println("Binary tree is a BST : " + bst.isBST());
    }
}
