import java.io.*;
import java.util.*;
import java.*;

public class reverseString {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String reverse = "";
        
        for(int i = S.length()-1 ; i >= 0 ; i--)
        {
            reverse = reverse + S.charAt(i);
        }
        
        System.out.println("string reverse : " + reverse);
    }
}



