import java.util.ArrayList;
import java.util.List;

class BinarySearchTree {
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    }

    static Node root; 

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
    
    boolean rootToLeafToSum(Node root,int sum,List<Integer> result)
    {
        if(root == null)
        {
            return false;
        }
        
        if(root.left == null && root.right == null)
        {
            if(root.key == sum)
            {
                result.add(root.key);
                return true;
            }   
            else
            {
                return false;
            }
        }
        
        if(rootToLeafToSum(root.left,sum-root.key,result) || rootToLeafToSum(root.right,sum-root.key,result))
        {
            result.add(root.key);
            return true;
        }
        return false;
            
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
        
        List<Integer> result = new ArrayList<Integer>();
        boolean res = bst.rootToLeafToSum(root,120,result);
        
        if(res == true)
        {
            System.out.println("path yes");
            System.out.println(result);
        }
        else
        {
            System.out.println("No path for sum " + 22);
        }
    }
}