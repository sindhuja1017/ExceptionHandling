package strings;

public class AllCharactersOfGivenWord {

	public static void main(String[] args) {
		String s1="rabbit bribe dog";
		String s2="bib";
		String[] s=s1.split(" ");
		int count=0;
		char[] c=s2.toCharArray();
		for(int i=0;i<s[0].length();i++)
		{
			count=0;
			for(int j=0;j<c.length;j++)
			{
				char ch=s[0].charAt(i);
				if(ch == c[j])
				{
					count++;
					System.out.println(count);
				}
			}
		}
		System.out.println(s[0]);
		
		
	}

}
