import java.util.ArrayList;

public class Main
{
	static ArrayList<String> result = new ArrayList<>();
	public static void swap(char[] ch,int i,int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
	public static void permutations(char[] ch,int currentIndex)
	{
		if(currentIndex == ch.length - 1)
		{
		    if(!result.contains(String.valueOf(ch)))
		    {
		        result.add(String.valueOf(ch));
		    }
		}
		
		for(int i = currentIndex; i < ch.length; i++)
		{
			swap(ch,currentIndex,i);
			permutations(ch,currentIndex + 1);
			swap(ch,currentIndex,i);
		}
	}
	public static void main(String args[])
	{
		String s = "ABAB";
		permutations(s.toCharArray(),0);
		for(String str : result)
		{
		    System.out.println(str);
		}
	}
}
