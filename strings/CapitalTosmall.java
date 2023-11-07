package strings;

public class CapitalTosmall {

	public static void main(String[] args) {
		String s1=new String("HeLLO good MORnINg");
		int z=0;
		for(int x=0;x<s1.length();x++)
		{
			char c=(s1.charAt(x));
			int y=(int)c;
			if(y>=65 && y<=90)
			{
				System.out.print(Character.toLowerCase(c));
			}
			else if(y>=97 && y<=122)
			{
				z=y-32;
				System.out.print((char)z+"");
			}
			else
				System.out.print(c+"");
		}
	}

}
