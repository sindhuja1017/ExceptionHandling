package oops;

public class InterfaceImplementation {

	public static void main(String[] args) {
		AAAA a=new AAAA();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		One1 o=new AAAA();//UPCASTING
		o.method1();
		o.method4();
	}
}
interface One1
{
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
	public abstract void method4();
}
class AAAA implements One1
{
	public void method1()
	{
		System.out.println("I'm in method1");
	}
	public void method2()
	{
		System.out.println("I'm in method2");
	}
	public void method3()
	{
		System.out.println("I'm in method3");
	}
	public void method4()
	{
		System.out.println("I'm in method4");
	}
}