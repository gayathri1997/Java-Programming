/*
 
1) If right subtree of node is not NULL, then succ lies in right subtree. Do following.
Go to right subtree and return the node with minimum key value in right subtree.
2) If right sbtree of node is NULL, then start from root and us search like technique. Do following.
Travel down the tree, if a node’s data is greater than root’s data then go right side, otherwise go to left side.

*/


class BinarySearchTree {
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    }

    static Node root,node,succ; 

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
    int minValue(Node node)
    {
        Node current = node; 
        while (current.left != null) { 
            current = current.left; 
        } 
        return current.key; 
    }
    int inOrderSuccessor(Node root,Node node)
    {
        // 1st condition
        // if node of right is not null then succ is smallest element of right subtree
        if(node.right != null)
        {
            return minValue(node.right);
        }
        
        // when node of right is null then succ is in the ancestors
        // start from the root node. Similar to search technique traverse down the tree 
        while(root != null)
        {
            if( node.key < root.key)
            {
                succ = root;
                root = root.left;
            }
            else if( node.key > root.key)
            {
                root = root.right;
            }
            else
            {
                break;
            }
        }
        return succ.key;
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
  
        Node node = root.left;
        System.out.println("inorder successor node for " + node.key + " is " + bst.inOrderSuccessor(root,node));

        node = root.left.right.left;
        System.out.println("inorder successor node for" + node.key + " is " + bst.inOrderSuccessor(root,node));
    
        node = root.left.right.right;
        System.out.println("inorder successor node for" + node.key + " is " + bst.inOrderSuccessor(root,node));
    
    }
}