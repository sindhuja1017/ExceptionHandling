package arrays;

public class Array2halves {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		int b[]=new int[a.length/2];
		int c[]=new int[a.length/2];
		for(int x=0;x<a.length/2;x++)
		{
			b[x]=a[x];
		}
		System.out.println("B array: ");
		for(int x=0;x<b.length;x++)
		{
			System.out.print(b[x]+"  ");
		}
		for(int x=a.length-1;x>=a.length/2;x--)
		{
			c[a.length-1-x]=a[x];
		}
		System.out.println();
		System.out.println("C array: ");
		for(int x=0;x<c.length;x++)
		{
			System.out.print(c[x]+"  ");
		}
		
	}

}
