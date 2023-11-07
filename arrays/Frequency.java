package arrays;

public class Frequency {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,5,3,8,2,6,4,7,5,6};
		for(int x=0;x<a.length;x++)
		{
			int temp=a[x],count=0;
			for(int y=0;y<a.length;y++)
			{
				if(temp==a[y])
					count++;
			}
			System.out.println("The frequency of "+a[x]+" is "+count);
		}
	}

}
