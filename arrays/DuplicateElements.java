package arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] a=new int[] {23,45,23,67,81,23,66,89,89,34,45,77,81,100};
		boolean b[]=new boolean[a.length];
		int count=1;
		System.out.println("Given array ");
		for(int z:a)
			System.out.print(z+" ");
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			count=1;
			if(b[i]==true)
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=true;
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("Duplicate Elements are : "+a[i]);
			}
		}
		
	}

}
