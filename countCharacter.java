package october100;

public class countCharacter 
{
	public static void main(String []args)
	{
		String str="The best of both words";
		int count=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=(' '))
				count++;
		}
		System.out.println("Total number of character in a strin"+count);
	}

}
