package selfpratices;

import java.util.Scanner;
public class rectangleProgram 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		double length=sc.nextDouble();
		System.out.println("Enter the breath");
		double breath=sc.nextDouble();
		double result=length*breath;
		System.out.println("Area = " +result);
		
		
		
	}

}
