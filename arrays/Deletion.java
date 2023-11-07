package arrays;

public class Deletion {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6};
		int x,y,index=3;
		System.out.println("Before Deletion");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+"  ");
		}
		System.out.println("After deletion");
		for(x=index;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		for(int temp:a)
		{
			System.out.print(temp+"  ");
		}
	}

}
