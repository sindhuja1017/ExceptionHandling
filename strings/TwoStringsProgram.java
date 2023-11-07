package strings;

public class TwoStringsProgram {

	public static void main(String[] args) {
		String s1="the quick brown fox";
		String s2="queen";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c2.length;i++)
		{
			for(int j=0;j<c1.length;j++)
			{
				if(c2[i]==c1[j])
				{
					c1[j]='0';
				}
			}
		}
		for(int k=0;k<c1.length;k++)
		{
			if(c1[k]!='0')
			{
				System.out.print(c1[k]);
			}
		}
	}
}
