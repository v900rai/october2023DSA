package october100;

public class Duplicatesss 
{
	public static void main(String []args)
	{
		int arr[]=new int[]{100, 200, 300,400,500,600};
		findDuplicatesUsingBruteForce(arr);
		
		
	}
	 private static void findDuplicatesUsingBruteForce(int[] inputArray)
	    {
	        for (int i = 0; i < inputArray.length; i++) 
	        {
	            for (int j = i+1; j < inputArray.length; j++) 
	            {
	                if(inputArray == inputArray)
	                {
	                    System.out.println("Duplicate Element : "+inputArray);
	                }
	            }
	        }
	    }
}
