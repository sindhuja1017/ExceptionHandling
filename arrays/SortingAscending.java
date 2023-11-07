package arrays;

public class SortingAscending {

	public static void main(String[] args) {
		int a[]=new int[] {10,50,20,90,100,40,30,80,60,70};
		for(int temp:a)
			System.out.print(temp+"  ");
		System.out.println();
		for(int x=0;x<a.length;x++)
		{
			System.out.println(x+" Iteration ");
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x] < a[y])
				{
					a[x]=a[x]+a[y];
					a[y]=a[x]-a[y];
					a[x]=a[x]-a[y];
					for(int z:a)
						System.out.print(z+"  ");
					System.out.println();
				}
				
			}
		}
		for(int temp:a)
		{
			System.out.print(temp+ "  ");
		}
		
	}
}
