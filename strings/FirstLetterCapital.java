package strings;

public class FirstLetterCapital {

	public static void main(String[] args) {
		String s="hello All good morning";
		String[] s1=s.split(" ");
		String s3="";
		for(int x=0;x<s1.length;x++)
		{
			String s2=s1[x];
			
			
			for(int i=0;i<s2.length();i++)
			{
				char c=s2.charAt(i);
				if(i==0 && Character.isLowerCase(c))
				{
					s3=s3+Character.toUpperCase(c);
				}
				else
				{
					char ch=s2.charAt(i);
					s3=s3+ch;
				}
			}
			s3=s3+" ";
		}
		System.out.println(s3);
	}

}
