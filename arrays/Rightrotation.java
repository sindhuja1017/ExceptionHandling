package arrays;

public class Rightrotation {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int x,rotation=3;
		for(x=a.length-1;x>a.length-1-rotation;x--)
		{
			System.out.print(a[x]+"  ");
		}
		for(x=0;x<=a.length-1-rotation;x++)
		{
			System.out.print(a[x]+"  ");
		}
	}

}
