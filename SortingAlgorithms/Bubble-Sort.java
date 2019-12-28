import  java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int n,temp;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter n ");
		n = in.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
		    a[i] = in.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
		    for(int j=0;j<n-i-1;j++)
		    {
		        if(a[j] > a[j+1])
		        {
		            temp = a[j];
		            a[j] = a[j+1];
		            a[j+1] = temp;
		        }
		    }
		}
		
		System.out.println("Sorted Array");
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i] + " ");
		}
	}
}
