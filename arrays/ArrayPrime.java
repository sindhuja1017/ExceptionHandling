package arrays;

public class ArrayPrime {

	public static void main(String[] args) {
		int a[]=new int[] {12,13,15,17,20,23};
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			for(int y=2;y<a[x];y++)
			{
				if(a[x]%y==0)
				count++;
			}
			if(count==0)
				System.out.println(a[x]);
		}
	}

}
