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
		
		for(int i=1;i<n-1;i++)
		{
		    int key = a[i];
		    int j = i-1;
		    
		    while(j>=0 && a[j] > key)
		    {
		        a[j+1]=a[j];
		        j = j - 1;
		    }
		    a[j+1] = key;
		}
		
		System.out.println("Sorted Array");
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i] + " ");
		}
	}
}
