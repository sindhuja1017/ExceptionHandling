package classesAndObjects;

public class Argument1 {

	public static void main(String[] args) {
		Args d= new Args();
		int a=d.Display(3.5,78,"hi");
		System.out.println(a);
	}
}
class Args
{
	public int Display(double x,int y,String z)
	{
		System.out.println(x+" "+y+" "+z);
		return y;
	}
}
