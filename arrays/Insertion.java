package arrays;

public class Insertion {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9};
		int x,y,index=3,element=55;
		System.out.println("Before Insertion");
		for(int temp1:a)
		{
			System.out.print(temp1+"  ");
		}
		
		for(x=a.length-1;x>index;x--)
		{
			a[x]=a[x-1];
		}
		a[index]=element;
		System.out.println("After Insertion");
		for(int temp2:a)
		{
			System.out.print(temp2+"  ");
		}
	}

}
