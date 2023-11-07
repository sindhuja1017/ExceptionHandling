package strings;

public class Abbccc {

	public static void main(String[] args) {
		String s=new String("a1b2c3");
		System.out.println("Input : "+s);
		int z=0;
		System.out.println("Output: ");
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c>='0' && c<='9')
			{
				z=Character.getNumericValue(c);
			}
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			{
				for(int y=0;y<=z;y++)
				{
					System.out.print(c+"");
				}
			}
		}
	}

}
