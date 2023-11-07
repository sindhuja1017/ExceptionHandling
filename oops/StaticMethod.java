package oops;

public class StaticMethod {
	static int a;
	static
	{
		a=10;
		System.out.println("I'm in static block");
	}
	public static void staticmethod()
	{
		a=100;
		System.out.println("I'm in static method");
	}
	public static void main(String[] args) {
		
		staticmethod();
		System.out.println(a);
	}
}