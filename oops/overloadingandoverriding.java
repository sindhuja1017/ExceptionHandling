package oops;

public class overloadingandoverriding {

	public void method1()
	{
		System.out.println("I'm method 1");
	}
	public void method1(int a)
	{
		System.out.println("I'm overloaded method");
	}
	public static void main(String[] args)
	{
		Hellooo h1=new Hellooo();
		h1.method1(5);
	}
}

class Hellooo extends overloadingandoverriding
{
	public void method1(int a)
	{
		System.out.println("Im overrided  parameterized method");
	}
//	public void method1()
//	{
//		System.out.println("I'm overrided no param method");
//	}
}
