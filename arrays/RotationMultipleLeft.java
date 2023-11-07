package arrays;

public class RotationMultipleLeft {

	public static void main(String[] args) {
		//Multiple Rotation program
		int rotation=4,temp3=0,x;
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		for(int temp:a)
		{
			System.out.print(temp+"  ");
		}
		System.out.println("After Rotation");
		for(int y=0;y<rotation;y++)
		{
			temp3=a[0];
			for(x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
			}
			a[x]=temp3;
		}
		for(int temp:a)
		{
			System.out.print(temp+"  ");
		}
		
	}

}
