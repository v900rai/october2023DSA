package ArraysAll;

public class LargestNUmber 
{
	public static int getLargest(int number[])
	{
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0; i<number.length; i++)
		{
			if(largest<number[i])
			{
				largest=number[i];
			}
			if(smallest>number[i])
			{
				smallest=number[i];
			}
		}
		System.out.println("Print the smallest value :-->"+smallest);
		return largest;
	}
	public static void main(String []vishal)
	{
		int vishal1[]= {1,3,5,6,7,4,3};
		System.out.println("the largest number  --->"+getLargest(vishal1));
		
	}

}
