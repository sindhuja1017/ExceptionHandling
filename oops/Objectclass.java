package oops;

public class Objectclass {

	public static void main(String[] args) {
		AAAAAA a=new AAAAAA();
		System.out.println(a);
	}
}
class AAAAAA//implicitly it extends Object class =>
//class AAAAAA extends Object
//So we can use every method in Object class
{
	public void aaa()
	{
		System.out.println("i'm inside class A");
	}
}