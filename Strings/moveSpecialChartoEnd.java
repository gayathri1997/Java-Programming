public class Main
{
    public static String moveSpecialChartoEnd(String str)
    {
        int length = str.length();
        
        String regex = "[a-zA-Z0-9\\s+]";
        String res1 = "", res2 = "";
        for(int i = 0 ; i < length ; i++)
        {
            char c = str.charAt(i);
            
            if(str.valueOf(c).matches(regex))
            {
                res1 = res1 + c;
            }
            else
            {
                res2 = res2 + c;
            }
        }
        return res1 + res2;
    }
    public static void main(String args[])
    {
        String str = "Geeksf!@orgeek@s A#$ c%o^mputer";
        System.out.println(moveSpecialChartoEnd(str));
    }
}
