package arrays;

public class ArraySwap {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int temp;
		for(int x=0;x<a.length-1;x+=2)
		{
			for(int y=0;y<1;y++)
			{
				temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;
			}
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
	}

}
