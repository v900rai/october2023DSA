package ArraysAll;

import java.util.Scanner;

public class buzzNumber
{
	public static void main(String []args)
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		if(checknumber(n1))
		{
			System.out.println("It is the buzz number");
		}
		else
		{
			System.out.println("It is not buzz number");
			
		}
		if(checknumber(n2))
		{
			System.out.println("It is a buzz number");
		}
		else
		{
			System.out.println("It is a buzz number"); 
		}
	}
	
	 static  boolean checknumber(int number )
	{
		if(number%10==0||number%7==0)
			return true;
		else 
			return false;
		
	
	}
}
