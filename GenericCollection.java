package ArraysAll;
import java.util.ArrayList;
public class GenericCollection 
{
	public static void main(String []vishal)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("vishal");
		a1.add("mohan");
		a1.add("Dinga");
		a1.add("sohan");
		a1.add("Harbhajan");
		a1.add("virat");
		a1.add("pant");
		System.out.println("_____________******vishal******____________");
		System.out.println();
		System.out.println("a1--->: "+a1);
		System.out.println();
		System.out.println("_____________******rai******____________");
		System.out.println();
		
		
		System.out.println("Strats with v");
		System.out.println();
		for(int i=0; i<=a1.size()-1; i++) {
			String s=a1.get(i);
		{
			if(s.startsWith("v"))
			{
				System.out.println("s");
			}
			
		}
		
	}
	
	}
}
