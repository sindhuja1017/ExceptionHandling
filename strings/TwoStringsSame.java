package strings;
public class TwoStringsSame {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("python exercises");
		String s2=new String("exercises");
		char c1[]=new char[s1.length()];
		char c2[]=new char[s2.length()];
		
		int count=0;
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer(s2);
		c1=sb1.reverse().toString().toCharArray();
		c2=sb2.reverse().toString().toCharArray();
		char ch=s1.charAt(3);
		if(Character.isAlphabetic(ch))
		{
			System.out.println(s1.codePointAt(4));
		}
		for(int i=1;i<=2;i++)
		{
			if(c1[i]==c2[i])
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("Same");
		else
			System.out.println("Not same");
	}

}
