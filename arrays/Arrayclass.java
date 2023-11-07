package arrays;

public class Arrayclass {
	int a[]=new int[] {1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		Arrayclass ar=new Arrayclass();
		for(int x=0;x<ar.a.length;x++)
			System.out.print(ar.a[x]+"  ");	
	}
}
class Array7
{
	Arrayclass arr=new Arrayclass();
	public void method2()
	{
		for(int x:arr.a)
			System.out.print(x+" ");
	}
}
