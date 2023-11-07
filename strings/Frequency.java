package strings;

public class Frequency {

	public static void main(String[] args) {
		String s=new String("hello good morning");
		char a[]=s.toCharArray();
		boolean[] b=new boolean[a.length];

		for(int x=0;x<a.length;x++)
		{
			int count=1;
			if(b[x]==true)
				continue;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					b[y]=true;
					count++;
				}
			}
			System.out.println("Frequency of "+a[x]+" is "+count);
		}
	}

}
