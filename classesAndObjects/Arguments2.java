package classesAndObjects;

public class Arguments2 {

	public static void main(String[] args) {
		int x=12;
		char y='i';
		Hello hel=new Hello();
		hel.display(x);
		hel.display2(x,y);
	}

}
class Hello
{
	public void display(int a)
	{
		System.out.println("I'm printing "+a);
	}
	public void display2(int d,char e)
	{
		System.out.println("I'm printing "+d+" and "+e);
	}
}