package ExceptionHandling;

public class Exception1 {
	public static void main(String[] args)
	{
		String s1="hello";
		try
		{
			System.out.println(s1.charAt(5));
		}
		catch(StringIndexOutOfBoundsException ad)
		{
			System.out.println("I'm in catch");
		}
	}
}
