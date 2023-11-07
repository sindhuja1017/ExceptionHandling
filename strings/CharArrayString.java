package strings;

public class CharArrayString {

	public static void main(String[] args) {
		char[] c=new char[] {'c','r','o','w','n'};
		String s1="";
		for(int i=0;i<c.length;i++)
		{
			s1=s1+c[i];
		}
		System.out.println(s1);
	}

}
