class BinarySearchTree {
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    }

    static Node root,node1,node2; 

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

    int LCA(Node root,Node node1, Node node2)
    {
        if(root == null)
            return -1;

        if(root.key > node1.key && root.key > node2.key)
            return LCA(root.left,node1,node2);

        if(root.key < node1.key && root.key < node2.key)
            return LCA(root.right,node1,node2);

        return root.key;            
    }
    public static void main(String[] args) { 
        BinarySearchTree bst = new BinarySearchTree(); 
  
         /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80
       /   /  \
      10  35  45  */
        bst.insert(50); 
        bst.insert(30); 
        bst.insert(20); 
        bst.insert(40); 
        bst.insert(70); 
        bst.insert(60); 
        bst.insert(80); 
        bst.insert(10);
        bst.insert(35); 
        bst.insert(45); 
  
        Node node1 = root.left.left;
        Node node2 = root.left.right.left;

        System.out.println("Nodes are : " + node1.key + " and " + node2.key);
        System.out.println("Lowest Common Ancestor is " + bst.LCA(root,node1,node2));

        node1 = root.left.left;
        node2 = root.right.left;

        System.out.println("Nodes are : " + node1.key + " and " + node2.key);
        System.out.println("Lowest Common Ancestor is " + bst.LCA(root,node1,node2));
    }
}