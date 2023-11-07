package oops;
public class SingleInheritance {
	public static void main(String[] args) {
		B b=new B();
		b.method2();
		b.method1(4);
	}
}
class A
{
	int a;
	A()
	{
		a=10;
		System.out.println("I'm in A constructor");
	}
	void method1(int a)
	{
		System.out.println(this.a);
		System.out.println("Method 1");
	}
}
class B extends A
{
	B()
	{
		int a=5;
		System.out.println(super.a);
		System.out.println("I'm in B constructor ");
	}
	void method2()
	{
		System.out.println("Method 2");
	}
}