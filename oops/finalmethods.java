package oops;

public class finalmethods {
	final void method2()
	{
		System.out.println("I'm in final method");
	}
	public static void main(String[] args) {
		final int a=5;
		//a=10;
		
	}
}
class finalc
{
	final void method1()
	{
		System.out.println("I'm final class");
	}
}
class class2 extends finalc
{
	//void method1()
	{
		
	}
}
