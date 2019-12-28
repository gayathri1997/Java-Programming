import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S = in.next();

        System.out.println(S);
        int count;  
          
        char str[] = S.toCharArray();  
            
        for(int i = 0; i <str.length; i++) 
        {  
            count = 0;  
            for(int j = i+1; j <str.length; j++) 
            {  
                if(str[i] == str[j] && str[i] != ' ') 
                {
                    count++;   
                    str[j] = '0';  
                }  
            }   
            if(count > 0 && str[i] != '0')  
                System.out.println(str[i]);  
        }  
        
    }
}



