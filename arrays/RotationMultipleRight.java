package arrays;

public class RotationMultipleRight {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int x,y,temp,rotation=4;
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+"  ");
		}
		System.out.println();
		System.out.println("After Rotation");
		for(y=0;y<rotation;y++)
		{
			temp=a[a.length-1];
			for(x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
			}
			a[x]=temp;
		}
		for(int temp1:a)
		{
			System.out.print(temp1+"  ");
		}
	}

}
