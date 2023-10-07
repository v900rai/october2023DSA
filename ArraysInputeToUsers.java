package ArraysAll;
import java.util.*;
public class ArraysInputeToUsers 
{
	public static void main(String [] vishalrai)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int []a1=new int[size];
		System.out.println("Enter the value of arrays");
		for(int i=0; i<=a1.length; i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("All the value present in the arrays");
		for(int i=0; i<=a1.length-1; i++)
		{
			System.out.println(a1[i]+" ");
		}
		System.out.println();
		System.out.println("All the evevn value");
		for(int i=0; i<=a1.length-1; i++)
		{
			if(a1[i]% 2==0)
			{
				System.out.println(a1[i]+" \t");
			}
		}
	}	
}
