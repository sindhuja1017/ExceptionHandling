package oops;

public class MultipleInheritance {

	public static void main(String[] args) {
		One11 one=new IntImpl();
//		impl.method1();
//		impl.method2();
//		impl.method3();
//		impl.method4();
//		impl.method5();
//		impl.method6();
		one.method1();
		one.method2();
		
		
	}
}
interface One11
{
	public void method1();
	public void method2();
}
interface Two2
{
	public void method3();
	public void method4();
}
interface Three3
{
	public void method5();
	public void method6();
}

class IntImpl implements One11,Two2,Three3
{
	public void method1()
	{
		System.out.println("Method1");
	}
	public void method2()
	{
		System.out.println("Method2");
	}
	public void method3()
	{
		System.out.println("Method3");
	}
	public void method4()
	{
		System.out.println("Method4");
	}
	public void method5()
	{
		System.out.println("Method5");
	}
	public void method6()
	{
		System.out.println("Method6");
	}
}
