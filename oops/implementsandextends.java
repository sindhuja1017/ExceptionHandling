package oops;

public class implementsandextends {

	public static void main(String[] args) 
	{
		
		ABCDE a =new ABCDE();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
	}
}
interface inter1
{
	public void method1();
}
interface inter2
{
	public void method2();
}
interface inter3
{
	public void method3();
}
class BCDE
{
	public void method4()
	{
		System.out.println("I'm in method4");
	}
}
class ABCDE extends BCDE implements inter1,inter2,inter3 
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
}
