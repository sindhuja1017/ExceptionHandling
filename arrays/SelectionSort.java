package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]=new int[] {20,50,10,80,90,100,30,40,60,70};
		System.out.println("Before Sort");
		for(int z:a)
			System.out.print(z+"  ");
		System.out.println();
		System.out.println("After Sort");
		for(int x=0;x<a.length;x++)
		{
			int min=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[y]<a[min])
					min=y;
			}
			int temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		for(int z:a)
			System.out.print(z+"  ");
	}

}
