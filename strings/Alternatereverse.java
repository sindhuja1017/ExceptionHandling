package strings;

public class Alternatereverse {

	public static void main(String[] args) {
		String s="hello all good morning";
		String[] c=s.split(" ");
		String new1="";
		for(int x=0;x<c.length;x++)
		{
			if(x%2==0)
				new1=new1+c[x]+" ";
			else
			{
			StringBuffer sb=new StringBuffer(c[x]);
			String s2=sb.reverse().toString();
			new1=new1+s2+" ";
			}
		}
		System.out.println(new1);
		
	}

}
