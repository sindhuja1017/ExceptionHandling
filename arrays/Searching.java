package arrays;

public class Searching {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,5,9,4,10,6,3,7,8};
		int temp=0;
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>a[x+1])
			{
				temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;
				x=-1;
			}
		}
		for(int z:a)
			System.out.print(z+" ");
	}

}
