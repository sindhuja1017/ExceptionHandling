package strings;

public class Prime {

	public static void main(String[] args) {
		int rem;
		int x=Integer.parseInt("23489");
		for(;x>0;x/=10)
		{
			int count=0;
			rem=x%10;
			for(int y=1;y<=rem;y++)
			{
				if(rem%y==0)
				{
					count++;
				}	
			}
			if(count==2)
				System.out.println(rem);
		}
	}
}
