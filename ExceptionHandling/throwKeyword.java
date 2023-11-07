package ExceptionHandling;

public class throwKeyword 
{

	public static void main(String[] args) 
	{
		try
		{
			throw new ArrayIndexOutOfBoundsException("Hi this is user thrown arithmetic exception");
		}
		catch(Throwable ae)
		{
			System.out.println("Arithmetic exception is caught in this");
		}
	}

}
