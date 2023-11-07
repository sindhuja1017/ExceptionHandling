package oops;
public class Encapsulation {
	int a=20,b=40;
	public static void main(String[] args) {
		//encapsulation example:class
		Encapsulation enc=new Encapsulation();
		enc.method1();
	}
	void method1()
	{
		System.out.println(a+" "+b);
	}
}
