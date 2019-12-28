import java.io.*;
import java.util.*;
import java.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String reverse = "";
        
        for(int i = S.length()-1 ; i >= 0 ; i--)
        {
            reverse = reverse + S.charAt(i);
        }
        
        if(S.equals(reverse))
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
    }
}



