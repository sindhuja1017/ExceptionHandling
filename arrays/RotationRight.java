package arrays;

public class RotationRight {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6};
		int x,temp,rotations=3;;
		for(int y=0;y<rotations;y++)
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
