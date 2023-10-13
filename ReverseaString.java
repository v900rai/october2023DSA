package october100;

public class ReverseaString 
{
	public static void main(String []args)
	{
		String Str="VISHALRAI";
		String rev="";
		System.out.println(Str);
		for(int i=0; i<Str.length(); i++){
		rev=Str.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
