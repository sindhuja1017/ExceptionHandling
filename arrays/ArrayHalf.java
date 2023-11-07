package arrays;

public class ArrayHalf {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8};
		int half=a.length/2;
		for(int x=0;x<half;x++)
		{
			System.out.print(a[x]+"  ");
		}
		
		for(int x=a.length-1;x>=half;x--)
		{
			System.out.print(a[x]+"  ");
		}
	}

}
