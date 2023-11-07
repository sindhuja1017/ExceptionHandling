package oops;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.method1();
		p.method1(10);
		p.method1('a');
		p.method1(10,20);
		p.method1('c','d');
	}
	void method1()
	{
		System.out.println("Method1");
	}
	int method1(int a)
	{
		System.out.println("int method"+a);
		return a;
	}
	void method1(int a,int b)
	{
		System.out.println("int,int method"+a+" "+b);
	}
	void method1(char c)
	{
		System.out.println("Char method"+c);
	}
	void method1(char c,char d)
	{
		System.out.println("Char char method"+c+" "+d);
	}
}
