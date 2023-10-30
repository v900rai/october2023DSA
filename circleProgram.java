package selfpratices;

import java.util.Scanner;

public class circleProgram 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious");
		double radius =sc.nextInt();
		
		double reslut=3.14*radius*radius;
		System.out.println("Area of circle" +reslut);
	}
}
