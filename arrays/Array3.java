package arrays;

public class Array3 {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9};
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%4==0)
			{
				System.out.println(a[x]);
			}
		}
	}

}
