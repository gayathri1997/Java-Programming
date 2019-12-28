/*
steps:
1. str = "gayathri"
2. create hashset and stringBuffer
3. loop for each character in a string
4. if set contains the character then add to the set and append to the stringBuffer
5. after the loop, return sb.toString 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        String str = "gayathri";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str){
		
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < str.length() ; i++){
            Character c = str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString(); 
    }
}



