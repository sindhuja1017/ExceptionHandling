package strings;

public class HappyNewYear {

	public static void main(String[] args) {
		String s1="Happy New Year";
		String s[]=s1.split(" ");
		
		int count3[]=new int[]{s.length};
		int max=0,index=0;
		int count=0;
		for(int x=0;x<s.length;x++)
		{
			count=0;
			for(int y=0;y<s[x].length();y++)
			{
				char c=s[x].charAt(y);
				if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				index=x;
			}
		}
		System.out.println(max);
		System.out.println(s[index]);
		
	}

}
