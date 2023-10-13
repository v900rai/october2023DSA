package october100;

public class methodOverloading 
{
	static int plusMethodInt(int x, int y) {
		  return x + y;
		}

		static double plusMethodDouble(double x, double y) {
		  return x + y;
		}
		static String vishalrai(String name, String y)
		{
			return name+y;
		}

		public static void main(String[] args) {
		  int myNum1 = plusMethodInt(8, 5);
		  double myNum2 = plusMethodDouble(4.3, 6.26);
		  String vishalrai=vishalrai("vishal", "rai");
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);
		  System.out.println("String" +vishalrai);
		  
		}



}
