package oops;

public class Upcastinginterfaces {

	public static void main(String[] args) {
		ABC a=new ABCD();
		a.inter1();
		a.inter2();
	}
}
interface ABC
{
	public void inter1();
	public void inter2();
}
class ABCD implements ABC
{
	public void inter1()
	{
		System.out.println("I'm inter 1");
	}
	public void inter2()
	{
		System.out.println("I'm inter 2");
	}
	public void inter3()
	{
		System.out.println("I'm inter 3");
	}
}