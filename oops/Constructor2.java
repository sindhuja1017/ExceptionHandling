package oops;

public class Constructor2 {

	public static void main(String[] args) {
		Demo demo1=new Demo();
		Demo demo2=new Demo();
		demo1.print();
		demo2.print();
		String s=new String();
		String sd1=new String("eifj");
		StringBuffer sb=new StringBuffer("hi");
		String s10=new String(sb);
	}
}
class Demo
{
	int a,b;
	Demo()
	{
		a=10;
		b=20;
	}
	void print()
	{
		System.out.println(a+"  "+b);
	}
}
