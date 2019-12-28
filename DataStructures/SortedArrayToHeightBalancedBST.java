class BinarySearchTree {
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    }

    static Node root,node = null; 

    BinarySearchTree() {  
        root = null;  
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
    
    Node toBST(int[] numbers,int low,int high)
    {
        if(low > high)
        {
            return null;
        }
        
        int mid = (low + high)/2;
        
        Node node = new Node(numbers[mid]);
        node.left = toBST(numbers,low,mid-1);
        node.right = toBST(numbers,mid+1,high);
        
        return node;
    }  

    public Node sortedArrayToBST(int[] numbers) {
        return toBST(numbers, 0, numbers.length - 1);
    }  

    public static void main(String[] args) { 
        BinarySearchTree bst = new BinarySearchTree(); 
  
        /* Let us create following BST 
              40 
           /     \ 
          20      60 
         /  \    /  \ 
       10   30  50   70 */
         
        
        int numbers[] = {10,20,30,40,50,60,70};
        
        root = bst.sortedArrayToBST(numbers);
        bst.inorder(); 
    }
}
