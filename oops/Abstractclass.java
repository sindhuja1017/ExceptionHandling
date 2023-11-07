package oops;

public class Abstractclass {

	public static void main(String[] args) {
		
		AAA a=new BBB();
		a.method1();
		a.method2();
	}
}
abstract class AAA
{
	void method1()
	{
		System.out.println("I'm in method1");
	}
	abstract void method2();//unimplemented method/abstract method
}
class BBB extends AAA
{
	@Override 
	void method1()
	{
		System.out.println("I'm updated method");
	}
	void method2()
	{
		System.out.println("I'm in child class");
	}
}