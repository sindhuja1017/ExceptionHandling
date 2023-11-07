package arrays;

public class SecondLargestSingleloop {

	public static void main(String[] args) {
		int[] a=new int[] {10,80,90,20,30,40,100,70};
		System.out.println("Array ");
		int first=Integer.MIN_VALUE;
		int second=first;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<first && a[i]>second)
			{
				second=a[i];
			}
			else if(first<a[i])
			{
				second=first;
				first=a[i];
				
				System.out.println(second);
			}
		}
		System.out.println("First : " +first);
		System.out.println("Second largest : "+second);
		
	}

}
