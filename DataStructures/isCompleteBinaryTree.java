
import java.util.LinkedList; 
import java.util.Queue; 

public class CompleteBTree 
{ 
  
    static class Node 
    { 
        int data; 
        Node left; 
        Node right; 
        
        Node(int d) 
        { 
            data = d; 
            left = null; 
            right = null; 
        } 
    } 
    
    static boolean isCompleteBT(Node root) 
    { 
        if(root == null) 
            return true; 
        
        Queue<Node> queue =new LinkedList<>(); 
        
        // Create a flag variable which will be set true 
        // when a non full node is seen 
        boolean flag = false; 
        
        queue.add(root); 
        while(!queue.isEmpty()) 
        { 
            Node temp_node = queue.remove(); 
            
            if(temp_node.left != null) 
            {                
                if(flag == true) 
                    return false; 
                
                queue.add(temp_node.left); 
            } 
            // If this a non-full node, set the flag as true 
            else
                flag = true; 

            if(temp_node.right != null) 
            { 
                if(flag == true) 
                    return false; 
                
                queue.add(temp_node.right); 
                
            } 
            // If this a non-full node, set the flag as true 
            else
                flag = true; 
        } 
        return true; 
    } 
    
    public static void main(String[] args) 
    { 
        
        /* Let us construct the following Binary Tree which 
        is not a complete Binary Tree 
             1 
            / \ 
          2     3 
         / \   / 
        4   5 6 
        */
    
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        
        if(isCompleteBT(root) == true) 
            System.out.println("Complete Binary Tree"); 
        else
            System.out.println("NOT Complete Binary Tree"); 
    } 

} 
