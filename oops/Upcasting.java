package oops;

public class Upcasting {

	public static void main(String[] args) {
		Aaaaa a=new Bbbbb();
		a.method1();
		a.method2();
		a.method3();
		
	}
}
class Aaaaa
{
	public void method1()
	{
		System.out.println("A-method1");
	}
	public static void method2()
	{
		System.out.println("A-method2");
	}
	public static void method3()
	{
		System.out.println("A-method3");
	}
}
class Bbbbb extends Aaaaa
{
	public void method1()
	{
		System.out.println("B-method1");
	}
	
	public static void method3()
	{
		System.out.println("B-method3");
	}
	public void method4()
	{
		System.out.println("B-method4");
	}
	public void method5()
	{
		System.out.println("B-method5");
	}
}


