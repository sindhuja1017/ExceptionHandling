package oops;

public class This 
{
	int a=10,b=20;
	public static void main(String[] args) {
	This2 this2=new This2();
	}
}
class This2 extends This
{
	int a=200,b=400;
	This2()
	{
		System.out.println(super.a+" "+super.b);
	}
}
