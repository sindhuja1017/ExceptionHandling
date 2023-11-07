package oops;

public class Constructor1 {

	public static void main(String[] args) {
		Construct1 con=new Construct1();
		con.print();
		Construct1 con2=new Construct1(1000,2000);
		con2.print();
		Construct1 con3=new Construct1('c');
	}
}
class Construct1
{
	int a,b;
	Construct1()
	{
		a=10;
		b=20;
	}
	Construct1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Construct1(char ch)
	{
		System.out.println(ch);
	}
	void print()
	{
		System.out.println(a+"  "+b);
	}
}