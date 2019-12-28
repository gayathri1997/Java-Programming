/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;  

public class Main
{
	public static void main(String[] args) {
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();  
		
		String str = "java";
		char[] characters = str.toCharArray();
		for(char c : characters) {
		    if(!map.containsKey(c))
		    {
		        map.put(c,1);  
		    }
		    else
		    {
		        map.put(c,map.get(c)+1);
		    }
		}
         
        //Elements can traverse in any order  
        for(Map.Entry m:map.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
        }
	}
}
