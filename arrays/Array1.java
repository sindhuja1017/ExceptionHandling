package arrays;

public class Array1 {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,5};
		a[0]=1;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		int sum=0,mul=1;
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			for(int y=2;y<=a[x]/2;y++)
			{
				if(a[x]%y==0)
					count++;
			}
			if(count==0)
				System.out.println(a[x]);
			sum=sum+a[x];
			mul=mul*a[x];
		}
		
	}

}
