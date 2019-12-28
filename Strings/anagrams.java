import java.io.*;
import java.util.*;

public class AnagramsOrNot {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S1 = in.next();
        String S2 = in.next();

        System.out.println("Strings are anagram : " + checkAnagramsOrNot(S1,S2));
    }
    
    public static boolean checkAnagramsOrNot(String S1,String S2){
        
        char[] charArray1 = S1.toCharArray();
        char[] charArray2 = S2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1,charArray2);
        
    }
}
