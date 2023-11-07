package arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int[] a=new int[] {10,80,90,20,30,40,100,70};
		System.out.println("Original Array : " );
		for(int z:a)
			System.out.print(z+" ");
		System.out.println();
		int temp=0;
		for(int x=0;x<a.length;x++)
		{
			for(int j=0;j<a.length-1-x;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int z:a)
			System.out.print(z+" ");
	}

}
