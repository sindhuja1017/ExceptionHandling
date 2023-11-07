package arrays;

public class SortingReverse {

	public static void main(String[] args) {
		int a[]=new int[] {20,50,10,80,90,100,30,40,60,70};
		for(int x=a.length-1;x>=0;x--)
		{
			for(int y=x;y>=0;y--)
			{
				if(a[x] < a[y])
				{
					a[x]=a[x]+a[y];
					a[y]=a[x]-a[y];
					a[x]=a[x]-a[y];
				}
			}
		}
		for(int temp:a)
			System.out.print(temp+ "  ");
		
	}

}
