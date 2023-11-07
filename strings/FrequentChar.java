package strings;

public class FrequentChar {

	public static void main(String[] args) {
	
		int[] ch=new int[256];
		int i;
		String s1 = "successes";
		int max=0;
		char maxch=' ';
		char[] c=s1.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			char d=s1.charAt(i);
			(ch[d])++;
			if(ch[d]>max)
			{
				max=ch[d];
				maxch=c[i];
			}
		}
		
		System.out.println("First frequent : "+maxch);
		System.out.println();

	}

}
