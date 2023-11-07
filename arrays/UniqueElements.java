package arrays;

public class UniqueElements {

	public static void main(String[] args) {
		int a[]=new int[] {23,45,23,67,81,23,66,89,89,34,45,77,81,100};
		int count=1;
		boolean b[]=new boolean[a.length];
		System.out.println("Given array ");
		for(int z:a)
			System.out.print(z+" ");
		System.out.println();
		
		for(int i=0;i<a.length;i++)//i=0
		{
			count=1;
			if(b[i]==true)
				continue;
			for(int j=i+1;j<a.length;j++)//j=1,j=2
			{
				if(a[i]==a[j])
				{
					b[j]=true;//b[]=[false,false,true---]
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("Unique elements are "+a[i]);
			}
		/*
		 if(count==1)
		 	System.out.println("unique elements are "+a[i]);
		 */
		}
	}

}
