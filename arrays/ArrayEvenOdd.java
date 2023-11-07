package arrays;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
				System.out.print(a[x]+"  ");
		}
		System.out.println();
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2!=0)
			{
				System.out.print(a[x]+"  ");
			}
		}
	}

}
