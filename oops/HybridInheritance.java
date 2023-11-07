package oops;
public class HybridInheritance {
	public static void main(String[] args) {
		Son c1=new Son();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		Daughter da=new Daughter();
		da.method3();
		da.method6();
	}
}
class Parent1
{
	void method1()
	{
		System.out.println(" parent Method1");
	}
	void method2()
	{
		System.out.println("parent method2");
	}
}
class Father extends Parent1
{
	void method3()
	{
		System.out.println("parent-2 Method3");
	}
	void method4()
	{
		System.out.println("parent-2 method4");
	}
}
class Son extends Father
{
	void method5()
	{
		System.out.println("I'm son");
	}
}
class Daughter extends Father
{
	void method6()
	{
		System.out.println("I'm daughter");
	}
}

