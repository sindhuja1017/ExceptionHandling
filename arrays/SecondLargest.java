package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,6,5,7,8,9,3,4,5};
		int large=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>large)
			{
				large=x;
			}
		}
		
		int second=0;
		for(int x=0;x<large;x++)
		{
			while(x!=large)
			{
				if(a[x]>second)
					second=x;
					break;
			}
		}
		System.out.println("Second largest: "+a[second]);
		
	}

}
