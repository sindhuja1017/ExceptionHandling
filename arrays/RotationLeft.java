package arrays;

public class RotationLeft {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70};
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+"  ");
		}
		System.out.println("After Rotation");
		for(int x=0;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		for(int temp:a)
		{
			System.out.print(temp+"  ");
		}
	}

}
