package strings;

public class UniqueCharacter {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		char[] c=s.toCharArray();
		int count=1,c1=0;
		char a[]=new char[c.length];
		boolean b[]=new boolean[c.length];
		for(int i=0;i<c.length;i++)
		{
			count=1;
			if(b[i]==true)
				continue;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					b[j]=true;
					count++;
				}
			}
			
			if(count==1)
			{
				a[c1]=c[i];
				
				c1++;
				
			}
		}
		System.out.println(a[0]);
		
	}

}
